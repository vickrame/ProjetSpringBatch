/**
 * 
 */
package com.spring.batch.configuration.reader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.support.AbstractItemCountingItemStreamItemReader;
import org.springframework.core.io.Resource;
import org.springframework.util.ClassUtils;

import com.spring.batch.configuration.model.Model;

/**
 * @author vickrame
 *
 */
public class CustumFileReader extends
		AbstractItemCountingItemStreamItemReader<Model> implements
		ItemReader<Model> {

	private boolean noInput = false;
	private boolean isOpen = false;

	private static int counter = 0;

	private int positionReader = -1;

	private Resource resources;
	// private InputStream in;
	private ReadableByteChannel reader;

	private String separateur;

	public CustumFileReader() {
		setName(ClassUtils.getShortName(CustumFileReader.class));
	}

	// private String str;

	/**
	 * @throws Exception
	 */
	private String construireListeLigne() throws Exception {
		String str = null;

		StringBuffer bufferStr = new StringBuffer();
		ByteBuffer buffer = ByteBuffer.allocate(1);
		buffer.clear();
		// int offset;
		// buffer.r
		int positionByte = 0;
		boolean endofLine = false;
		while ((positionByte = reader.read(buffer)) != -1) { // lecture

			// buffer.remaining(); // retoune le nombre d element entre la
			// positon de départ jusqu ' la taille max
			// buffer.flip() ; // deplace le curseur mais le marqueur de
			// position reste identique.
			// buffer.get(); // lit les byte dans le buffer
			// System.out.println(buffer.remaining());
			buffer.flip();

			char caractere = (char) buffer.get();

			// System.out.println("caractere " + caractere);

			if ((caractere != '\n') && (caractere != '\r')) {
				bufferStr.append(caractere);
			} else {
				str = bufferStr.toString();
				bufferStr.delete(0, bufferStr.length());
				endofLine = true;
			}

			buffer.clear();

			if (endofLine) {
				break;
			}

			// if (positionReader != -1)
			// buffer.position(positionReader);
			//
			// buffer.flip();
			//
			// while (buffer.hasRemaining()) { // parcours le nombre de 0
			// // jusqu'a la fin de son buffer
			// // (byte par byte)
			//
			// positionReader++;
			// char caractere = (char) buffer.get();
			// // System.out.println(" dcdc " + caractere);
			//
			// if ((caractere != '\n') && (caractere != '\r')) {
			// bufferStr.append(caractere);
			//
			// } else {
			// System.err.println(buffer.position());
			// str = bufferStr.toString();
			// bufferStr.delete(0, bufferStr.length());
			// // reader.read(buffer);
			// endofLine = true;
			// break;
			//
			// }
			// }
			//
			// if (endofLine) {
			// // buffer.flip();
			// buffer.clear();
			// break;
			// } else {
			// // positionByte = reader.read(buffer);
			// buffer.clear();
			// }

		}

		// if (positionByte == -1) {
		// doClose();
		// }
		// System.err.println("Resultat de lecture de fin de ligne " + str);
		return str;
	}

	/**
	 * @throws IOException
	 * 
	 */
	private void doOpenResources() throws IOException {
		InputStream in = resources.getInputStream();
		reader = Channels.newChannel(in);
	}

	/**
	 * @throws IOException
	 * 
	 */
	private void doCloseResources() throws IOException {
		System.err.println(reader.isOpen());
		reader.close();
		System.err.println(reader.isOpen());
	}

	public void setResources(Resource resources) {
		this.resources = resources;
	}

	@Override
	protected Model doRead() throws Exception {

		System.err.println(counter++);
		Model m = null;
		if (reader != null) {
			String ligne = construireListeLigne();
			// System.err.println("ligne " + ligne);
			m = construireModel(ligne);
			// m.setIdModel(String.valueOf(counter));
			if (m != null)
				System.err
						.println("****************************************** "
								+ m.toString());

		}

		return m;
	}

	private Model construireModel(String ligne) {
		Model m = null;
		System.err.println("******************** ligne " + ligne);
		if (ligne != null && !ligne.trim().equals("")) {
			String[] tabLigne = ligne.split(separateur);
			m = new Model();
			m.setIdModel(tabLigne[0]);
			m.setCommentaire(tabLigne[1]);
		}

		return m;
	}

	@Override
	protected void doOpen() throws Exception {
		doOpenResources();
	}

	@Override
	protected void doClose() throws Exception {
		doCloseResources();
	}

	/**
	 * @param separateur
	 *            the separateur to set
	 */
	public void setSeparateur(String separateur) {
		this.separateur = separateur;
	}
}
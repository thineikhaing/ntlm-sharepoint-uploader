package org.tek.sharepoint.dms;

public interface DmsPort {
	public void sendFile(String filename, byte[] file, String type);
}

package com.yarncoms.config;

public class Configuration {
	private String gAbsolutePath;

	public String getAbsolutePath() {
		if (gAbsolutePath == null) {
			String lAbsolutePath = getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
			System.err.println("getPath "+lAbsolutePath);
			if (lAbsolutePath.contains("/lib")) {
				String os = System.getProperty("os.name").toLowerCase();
				if (os.indexOf("mac") < 0) {
					if (os.indexOf("linux") >= 0) {
						gAbsolutePath = lAbsolutePath.substring(0, lAbsolutePath.lastIndexOf("/lib"));
					} else if ((os.equals("windows 95")) || (os.equals("windows 98"))) {
						gAbsolutePath = lAbsolutePath.substring(1, lAbsolutePath.indexOf("/lib"));
						if (gAbsolutePath.contains("%20")) {
							gAbsolutePath = gAbsolutePath.replaceAll("%20", " ");
						}
					} else if ((os.indexOf("windows") >= 0) || (os.indexOf("nt") >= 0)) {
						gAbsolutePath = lAbsolutePath.substring(1, lAbsolutePath.indexOf("/lib"));
						if (gAbsolutePath.contains("%20")) {
							gAbsolutePath = gAbsolutePath.replaceAll("%20", " ");
						}
					}
				}
				gAbsolutePath = gAbsolutePath + "/";
			} else {
				gAbsolutePath = "";
			}
		}
		System.err.println("finalPath "+gAbsolutePath);
		return gAbsolutePath;
	}

	
}

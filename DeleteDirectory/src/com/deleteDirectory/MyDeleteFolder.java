package com.deleteDirectory;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class Logs {

	public void deleteAllFiles() {

		Path dir = Paths.get("D:\\tomcat8\\logs");
		try {
			Files.walkFileTree(dir, new SimpleFileVisitor<Path>() {
				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
					System.out.println("Deleting file: " + file);
					Files.delete(file);
					return FileVisitResult.CONTINUE;
				}

				@Override
				public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
					System.out.println("Deleting dir: " + dir);
					if (exc == null) {
//						Files.delete(dir); // for directory delete
						return FileVisitResult.CONTINUE;
					} else {
						throw exc;
					}
				}

			});
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

class Work {

	public void deleteCatalinaWithSubFiles() {

		Path dir = Paths.get("D:\\tomcat8\\work\\Catalina");
		try {
			Files.walkFileTree(dir, new SimpleFileVisitor<Path>() {
				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
					System.out.println("Deleting file: " + file);
					Files.delete(file);
					return FileVisitResult.CONTINUE;
				}

				@Override
				public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
					System.out.println("Deleting dir: " + dir);
					if (exc == null) {
						Files.delete(dir); // for directory delete
						return FileVisitResult.CONTINUE;
					} else {
						throw exc;
					}
				}

			});
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

class Webapps {

	public void deletAllFolderWithSubFolder() {

		Path dir = Paths.get("D:\\tomcat8\\webapps");
		try {
			Files.walkFileTree(dir, new SimpleFileVisitor<Path>() {
				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
					System.out.println("Deleting file: " + file);
					Files.delete(file);
					return FileVisitResult.CONTINUE;
				}

				@Override
				public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
					System.out.println("Deleting dir: " + dir);
					if (exc == null) {
						Files.delete(dir); // for directory delete
						return FileVisitResult.CONTINUE;
					} else {
						throw exc;
					}
				}

			});
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

public class MyDeleteFolder {

	public static void main(String[] args) {

		Logs lg = new Logs();

		lg.deleteAllFiles();
		Webapps wb = new Webapps();
		wb.deletAllFolderWithSubFolder();

		Work wk = new Work();
		wk.deleteCatalinaWithSubFiles();

	}

}

package ua.ilyxa05.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
	public static List<Proxy> proxies = new CopyOnWriteArrayList<>();
	public static String type;
	
	public static void main(String[] args){
		System.out.println("Вас приветствует щиткод написанный Великим Илюхой05.\nДанный высер предназначен для автоматической сборки а так же декодировки прокси из клиента Evolution.\nДоступные виды прокси: 1. SOCKS4, 2. Socks5, 3. HTTP, 4. ALL\nНапишите цифру, которая соответствует вашим предпочтениям:");
		Scanner sc = new Scanner(System.in);
		int type = sc.nextInt();
        if(type == 1) {
        	System.out.println("Начинаю парсить SOCKS4...");
        	try {
    			URL website = new URL("http://89.107.10.34/socks4");
                URLConnection connection = website.openConnection();
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                
                while ((inputLine = in.readLine()) != null) {
                    if (inputLine.contains(":")) {
                        String ip = inputLine;
                		
                		String v1 = ip.replaceAll("u", "0");
                		String v3 = v1.replaceAll("l", "1");
                		String v5 = v3.replaceAll("o", "2");
                		String v7 = v5.replaceAll("d", "3");
                		String v10 = v7.replaceAll("v", "4");
                		String v12 = v10.replaceAll("z", "5");
                		String v14 = v12.replaceAll("j", "6");
                		String v16 = v14.replaceAll("q", "7");
                		String v19 = v16.replaceAll("w", "8");
                		String v21 = v19.replaceAll("e", "9");
                		
                		System.out.println(v21);
                    } else {
                        System.out.println(inputLine + " error");
                    }
                }
            } catch (MalformedURLException var8) {
                System.err.println("Page does not exist!");
            } catch (IOException var9) {
                System.err.println("No internet!");
            }
        } else if(type == 2) {
        	System.out.println("Начинаю парсить SOCKS5...");
        	try {
    			URL website = new URL("http://89.107.10.34/socks5");
                URLConnection connection = website.openConnection();
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                
                while ((inputLine = in.readLine()) != null) {
                    if (inputLine.contains(":")) {
                        String ip = inputLine;
                		
                		String v1 = ip.replaceAll("u", "0");
                		String v3 = v1.replaceAll("l", "1");
                		String v5 = v3.replaceAll("o", "2");
                		String v7 = v5.replaceAll("d", "3");
                		String v10 = v7.replaceAll("v", "4");
                		String v12 = v10.replaceAll("z", "5");
                		String v14 = v12.replaceAll("j", "6");
                		String v16 = v14.replaceAll("q", "7");
                		String v19 = v16.replaceAll("w", "8");
                		String v21 = v19.replaceAll("e", "9");
                		
                		System.out.println(v21);
                    } else {
                        System.out.println(inputLine + " error");
                    }
                }
            } catch (MalformedURLException var8) {
                System.err.println("Page does not exist!");
            } catch (IOException var9) {
                System.err.println("No internet!");
            }
        } else if(type == 3) {
        	System.out.println("Начинаю парсить HTTP...");
        	try {
    			URL website = new URL("http://89.107.10.34/http");
                URLConnection connection = website.openConnection();
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                
                while ((inputLine = in.readLine()) != null) {
                    if (inputLine.contains(":")) {
                        String ip = inputLine;
                		
                		String v1 = ip.replaceAll("u", "0");
                		String v3 = v1.replaceAll("l", "1");
                		String v5 = v3.replaceAll("o", "2");
                		String v7 = v5.replaceAll("d", "3");
                		String v10 = v7.replaceAll("v", "4");
                		String v12 = v10.replaceAll("z", "5");
                		String v14 = v12.replaceAll("j", "6");
                		String v16 = v14.replaceAll("q", "7");
                		String v19 = v16.replaceAll("w", "8");
                		String v21 = v19.replaceAll("e", "9");
                		
                		System.out.println(v21);
                    } else {
                        System.out.println(inputLine + " error");
                    }
                }
            } catch (MalformedURLException var8) {
                System.err.println("Page does not exist!");
            } catch (IOException var9) {
                System.err.println("No internet!");
            }
        } else if(type == 4) {
        	System.out.println("Начинаю парсить все прокси...");
        	try {
    			URL website = new URL("http://89.107.10.34/socks4");
                URLConnection connection = website.openConnection();
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                
                while ((inputLine = in.readLine()) != null) {
                    if (inputLine.contains(":")) {
                        String ip = inputLine;
                		
                		String v1 = ip.replaceAll("u", "0");
                		String v3 = v1.replaceAll("l", "1");
                		String v5 = v3.replaceAll("o", "2");
                		String v7 = v5.replaceAll("d", "3");
                		String v10 = v7.replaceAll("v", "4");
                		String v12 = v10.replaceAll("z", "5");
                		String v14 = v12.replaceAll("j", "6");
                		String v16 = v14.replaceAll("q", "7");
                		String v19 = v16.replaceAll("w", "8");
                		String v21 = v19.replaceAll("e", "9");
                		
                		System.out.println(v21);
                    } else {
                        System.out.println(inputLine + " error");
                    }
                }
            } catch (MalformedURLException var8) {
                System.err.println("Page does not exist!");
            } catch (IOException var9) {
                System.err.println("No internet!");
            }
        	try {
    			URL website = new URL("http://89.107.10.34/socks5");
                URLConnection connection = website.openConnection();
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                
                while ((inputLine = in.readLine()) != null) {
                    if (inputLine.contains(":")) {
                        String ip = inputLine;
                		
                		String v1 = ip.replaceAll("u", "0");
                		String v3 = v1.replaceAll("l", "1");
                		String v5 = v3.replaceAll("o", "2");
                		String v7 = v5.replaceAll("d", "3");
                		String v10 = v7.replaceAll("v", "4");
                		String v12 = v10.replaceAll("z", "5");
                		String v14 = v12.replaceAll("j", "6");
                		String v16 = v14.replaceAll("q", "7");
                		String v19 = v16.replaceAll("w", "8");
                		String v21 = v19.replaceAll("e", "9");
                		
                		System.out.println(v21);
                    } else {
                        System.out.println(inputLine + " error");
                    }
                }
            } catch (MalformedURLException var8) {
                System.err.println("Page does not exist!");
            } catch (IOException var9) {
                System.err.println("No internet!");
            }
        	try {
    			URL website = new URL("http://89.107.10.34/http");
                URLConnection connection = website.openConnection();
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                
                while ((inputLine = in.readLine()) != null) {
                    if (inputLine.contains(":")) {
                        String ip = inputLine;
                		
                		String v1 = ip.replaceAll("u", "0");
                		String v3 = v1.replaceAll("l", "1");
                		String v5 = v3.replaceAll("o", "2");
                		String v7 = v5.replaceAll("d", "3");
                		String v10 = v7.replaceAll("v", "4");
                		String v12 = v10.replaceAll("z", "5");
                		String v14 = v12.replaceAll("j", "6");
                		String v16 = v14.replaceAll("q", "7");
                		String v19 = v16.replaceAll("w", "8");
                		String v21 = v19.replaceAll("e", "9");
                		
                		System.out.println(v21);
                    } else {
                        System.out.println(inputLine + " error");
                    }
                }
            } catch (MalformedURLException var8) {
                System.err.println("Page does not exist!");
            } catch (IOException var9) {
                System.err.println("No internet!");
            }
        }else {
        	System.out.println("Я не знаю такой вид прокси.\nДоступные виды: 1. SOCKS4, 2. Socks5, 3. HTTP, 4. ALL");
        }
	}
}

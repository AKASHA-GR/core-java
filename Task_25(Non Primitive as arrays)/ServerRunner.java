class ServerRunner{
	public static void main(String[] args){
		
		String[] type ={"web servers", "database servers", "file servers","cloud servers"};
		
		DNS dns1 = new DNS("google.com","142.250.190.46");
		DNS dns2 = new DNS("wikipedia.org","103.102.166.224");
		DNS dns3 = new DNS("youtube.com","142.250.190.78");
		
		
		DNS[] dns = new DNS[3];
		dns[0] = dns1;
		dns[1] = dns2;
		dns[2] = dns3;
		
		Server servers = new Server(type,dns);
		servers.display();
		
		
		
	}
}
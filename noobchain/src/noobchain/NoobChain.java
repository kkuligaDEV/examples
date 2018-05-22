package noobchain;

import java.util.ArrayList;

import com.google.gson.GsonBuilder;

public class NoobChain {
	
	public static ArrayList<Block> blockchain = new ArrayList<>();
	private static int difficulty = 5;
	
	
	public static void main(String[] args) {
		
		//Add our blocks to blockchain list:
		blockchain.add(new Block("HI i am the first block","0"));
		System.out.println("Trying to mine block 1");
		blockchain.get(0).mineBlock(difficulty);
		
		blockchain.add(new Block("HI i am the second block",blockchain.get(blockchain.size() - 1).hash));
		System.out.println("Trying to mine block 2");
		blockchain.get(1).mineBlock(difficulty);
		
		blockchain.add(new Block("HI i am the third block",blockchain.get(blockchain.size() - 1).hash));
		System.out.println("Trying to mine block 3");
		blockchain.get(2).mineBlock(difficulty);
		
		System.out.println("\nBlockChain is valid: "+ isChainValid());
		
		String blockChainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
		System.out.println(blockChainJson);
	}
	
	public static Boolean isChainValid() {
		Block currentBlock;
		Block previousBlock;
		
		for(int i = 1; i < blockchain.size(); i++) {
			currentBlock = blockchain.get(i);
			previousBlock = blockchain.get(i -1);
			
			if (!currentBlock.hash.equals(currentBlock.calculateHash())) {
				System.out.println("Current hashes are not equal");
				return false;
			}
			if (!previousBlock.hash.equals(previousBlock.calculateHash())) {
				System.out.println("Previous hashes are not equal");
				return false;
			}
		}
		return true;
	}

}

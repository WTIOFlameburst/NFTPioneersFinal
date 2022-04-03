package com.example.nftpioneers;

public class nft {
    private String name;
    private String category;
    private int imageName;
    private String rarity;
    private int priceOfNFT;

    // Constructors
    public nft(){
    }

    public nft (String name, String category, int imageName, String rarity, int priceOfNFT){
        this.name = name;
        this.category = category;
        this.imageName = imageName;
        this.rarity = rarity;
        this.priceOfNFT = priceOfNFT;
    }

    // Changes the price of NFT on a new day
    public void changePrice(double currentPrice, String rarity){
        int changePrice = 0;
        if (rarity.equals("Common")){ // If the NFT's rarity is common then price can change from 1 - 50
            changePrice = (int)(Math.random() * 50 + 1);
        }
        else if (rarity.equals("Epic")){ // If the NFT's rarity is epic then price can change from 50 - 250
            changePrice = (int)(Math.random() * 250 + 50);
        }
        else if (rarity.equals("Legendary")){ // If the NFT's rarity is legendary then price can change from 250 - 500
            changePrice = (int)(Math.random() * 500 + 250);
        }

        // Positive or negative
        int upOrDown = (int)(Math.random() * 2 + 1); // Random number between 1 - 2
        if (upOrDown == 1){ // If upOrDown equals 1 then add
            setPriceOfNFT((int) currentPrice + changePrice);
        }
        else if (upOrDown == 2){ // If upOrDown equals 2 then subtract
            setPriceOfNFT((int) currentPrice - changePrice);
            if ((int) currentPrice - changePrice < 0){ // If the price drops below 0 set to 0
                setPriceOfNFT(0);
            }
        }
    }

    // Getter methods

    public String getName(){
        return name;
    }

    public String getCategory(){
        return category;
    }

    public int getImageName(){
        return imageName;
    }

    public String getRarity(){
        return rarity;
    }

    public int getPriceOfNFT(){
        return priceOfNFT;
    }

    // Setter methods

    public void setName(String name){
        this.name = name;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void setImageName(int imageName){
        this.imageName = imageName;
    }

    public void setRarity(String rarity){
        this.rarity = rarity;
    }

    public void setPriceOfNFT(int priceOfNFT){
        this.priceOfNFT = priceOfNFT;
    }

}

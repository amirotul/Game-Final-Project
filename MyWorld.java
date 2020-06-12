import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (amirotul kotimah) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    private int skorLadybug;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
prepare();
}


    public int getskorLadybug (){
        return skorLadybug;
    }

    public void updskor(int x){
        skorLadybug+=x;
    }


    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ladybug ladybug = new Ladybug();
        addObject(ladybug,28,185);
        Flower flower = new Flower();
        addObject(flower,28,36);
        Flower flower2 = new Flower();
        addObject(flower2,153,91);
        Flower flower3 = new Flower();
        addObject(flower3,333,48);
        Flower flower4 = new Flower();
        addObject(flower4,483,118);
        Flower flower5 = new Flower();
        addObject(flower5,331,216);
        Flower flower6 = new Flower();
        addObject(flower6,137,223);
        Flower flower7 = new Flower();
        addObject(flower7,567,234);
        Flower flower8 = new Flower();
        addObject(flower8,422,353);
        Flower flower9 = new Flower();
        addObject(flower9,219,348);
        Flower flower10 = new Flower();
        addObject(flower10,101,342);
        flower4.setLocation(537,83);
        flower5.setLocation(384,205);
        flower8.setLocation(454,368);
        flower9.setLocation(283,345);
        flower10.setLocation(55,357);
        flower6.setLocation(139,235);
        flower3.setLocation(352,48);
        flower2.setLocation(183,101);
        flower5.setLocation(344,219);
        flower5.setLocation(365,180);
        flower8.setLocation(470,367);
        Flower flower11 = new Flower();
        addObject(flower11,430,283);
        Flower flower12 = new Flower();
        addObject(flower12,479,174);
        Flower flower13 = new Flower();
        addObject(flower13,257,263);
        Flower flower14 = new Flower();
        addObject(flower14,73,123);
        flower2.setLocation(213,96);
        flower14.setLocation(80,124);
        Flower flower15 = new Flower();
        addObject(flower15,562,352);
        flower10.setLocation(35,368);
        flower9.setLocation(314,365);
        flower13.setLocation(183,343);
        flower5.setLocation(321,209);
        flower5.setLocation(298,213);
        flower12.setLocation(450,144);
        flower11.setLocation(429,259);
        flower2.setLocation(183,56);
        flower5.setLocation(286,175);
        flower6.setLocation(134,257);
        flower13.setLocation(224,320);
        flower10.setLocation(23,363);
        flower6.setLocation(97,259);
        flower13.setLocation(176,339);
        flower5.setLocation(234,190);
        flower11.setLocation(356,260);
        flower7.setLocation(503,256);
        flower15.setLocation(581,351);
        flower4.setLocation(556,67);
        flower12.setLocation(430,151);
        flower3.setLocation(339,62);
        flower7.setLocation(539,204);
        flower3.setLocation(348,25);
        flower12.setLocation(430,112);
        flower11.setLocation(412,233);
        flower8.setLocation(466,345);
        flower11.setLocation(379,239);
        flower8.setLocation(468,309);
        flower11.setLocation(366,253);
        flower5.setLocation(255,157);
        flower6.setLocation(95,240);
        flower13.setLocation(193,314);
        flower8.setLocation(469,319);
        Ant ant = new Ant();
        addObject(ant,428,22);
        ant.turn(45);
        ant.turn(45);
        ant.turn(120);
        flower.setLocation(28,28);
        flower2.setLocation(177,75);
        flower6.setLocation(84,272);
        flower10.setLocation(25,374);
        flower6.setLocation(76,272);
        flower13.setLocation(174,326);
        flower9.setLocation(323,377);
        flower11.setLocation(375,274);
        flower15.setLocation(578,375);
        flower8.setLocation(475,323);
        flower7.setLocation(529,218);
        flower7.setLocation(525,223);
        flower12.setLocation(428,130);
        flower5.setLocation(271,176);
        flower2.setLocation(172,35);
        flower2.setLocation(174,27);
        flower4.setLocation(573,27);
        flower3.setLocation(333,124);
        flower2.setLocation(271,30);
        flower2.setLocation(327,29);
        flower13.setLocation(176,320);
        flower13.setLocation(174,227);
        flower11.setLocation(275,280);
        flower8.setLocation(425,281);
        flower8.setLocation(424,275);
        flower3.setLocation(422,180);
        flower12.setLocation(225,75);
        Flower flower16 = new Flower();
        addObject(flower16,426,84);
        flower16.setLocation(425,77);
        Flower flower17 = new Flower();
        addObject(flower17,578,131);
        flower17.setLocation(573,123);
        flower6.setLocation(173,320);
        flower8.setLocation(474,325);
        flower3.setLocation(384,221);
        flower3.setLocation(377,224);
        flower13.setLocation(119,234);
        flower17.setLocation(529,127);
        Flower flower18 = new Flower();
        addObject(flower18,32,237);
        flower18.setLocation(25,228);
        ladybug.setLocation(27,170);
        flower5.setLocation(229,177);
        Flower flower19 = new Flower();
        addObject(flower19,335,136);
        flower19.setLocation(327,128);
        flower12.setLocation(177,75);
        flower3.setLocation(423,228);
        flower11.setLocation(319,276);
        flower13.setLocation(127,227);
    removeObject(flower);
flower12.setLocation(148,35);
flower14.setLocation(120,130);
}
}
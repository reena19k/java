package com.aurionpro.test;
import com.aurionpro.model.*;
import java.util.*;
public class CountryTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Regions[] r = {new Regions(1, "Europe"),
                new Regions(2, "Americas"),
                new Regions(3, "Asia"),
                new Regions(4, "Middle East and Africa")};
        List<Regions> regionsList = new ArrayList<>();

        for (Regions r1 : r) {
            regionsList.add(r1);
        }

        Countries[] c = {new Countries("IT", "italy", 1), new Countries("JP", "Japan", 3),
                new Countries("US", "UnitesStates of America", 2), new Countries("CA", "Canada", 2),
                new Countries("CN", "china", 3), new Countries("IN", "india", 3), new Countries("AU", "Australia", 3),
                new Countries("ZW", "Zimbambwe", 4), new Countries("SG", "Singapore", 3), new Countries("UK", "United kingdom", 1),
                new Countries("FR", "France", 1), new Countries("DE", "Germany", 1), new Countries("ZM", "Zambia", 4), new Countries("EG", "Egypt", 4),
                new Countries("BR", "Brazil", 2), new Countries("CH", "Switzerland", 1), new Countries("NL", "Netherlands", 1),
                new Countries("MX", "Mexico", 2), new Countries("KW", "Kuwait", 4), new Countries("IL", "Israel", 4),
                new Countries("DK", "Denmark", 1), new Countries("HK", "HongKong", 3), new Countries("NG", "Nigeria", 4), new Countries("AR", "Argentina", 2),
                new Countries("BE", "Belgium", 1)
        };

        List<Countries> countriesList = new ArrayList<>();
        for (Countries c1 : c) {
            countriesList.add(c1);
        }

        System.out.println("Enter the region Code : (1-4) ");
        int code = sc.nextInt();
        System.out.println(getCountriesByRegionId(code, (ArrayList<Countries>) countriesList));
        sc.nextLine();
        System.out.println("Enter the region :(1-Asia/2-Europe/3-Americas/4-Middle East and Africa) ");
        String str =sc.nextLine();
        System.out.println(countCountriesByRegion(str,(ArrayList<Countries>)countriesList,(ArrayList<Regions>)regionsList));
        //sc.nextLine();
        System.out.println("Enter the Country code");
        String str1 = sc.nextLine();
        getCountryNameAndRegionName(str1,(ArrayList<Countries>) countriesList,(ArrayList<Regions>) regionsList);
    }

    private static ArrayList<Countries> getCountriesByRegionId(int rid, ArrayList<Countries> cs) {
        ArrayList<Countries> countriesArrayList = new ArrayList<>();
        for (Countries c : cs) {
            if (rid == c.getRegId()) {
                countriesArrayList.add(c);
            }
        }
        return countriesArrayList;
    }

    private static int countCountriesByRegion(String region, ArrayList<Countries> cs,ArrayList<Regions> rs) {
        int count = 0;
           for (Regions r:rs) {
               for (Countries c : cs) {
                   if (r.getZone().equals(region) && r.getId()==c.getRegId()) {
                       count++;
                   }
               }
           }
           
        return count;
    }

    private static void getCountryNameAndRegionName(String cCode,ArrayList<Countries> cs, ArrayList<Regions> rs){
        int r=0;
            for (Countries c : cs) {
                if (c.getCode().equals(cCode)) {
                    System.out.println(c.getCountryName());
                    r = c.getRegId();
                }
            }
              for(Regions region : rs){
                  if(r==region.getId()){
                      System.out.println(region.getZone());
                  }
              }
    }

}
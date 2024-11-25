public class Gene {
    private String dna;
    private int geneCount;

    public Gene(String D) {
        dna = D;
        geneCount = D.length();
    }

    public static int findStopCodon(String genome, int start){
        if (genome.length()%3 != 0) return -1;
        for (int i = start; i < genome.length()-2;i+=3){
            if (genome.substring(i,i+3).equals("TAA") || genome.substring(i,i+3).equals("TAG") || genome.substring(i,i+3).equals("TGA")){
        return i;
        }
        }
        return -1;
    }
    
    public static int countNucleotides(String g, Character nucleotide){
        int i = 0;
        for(int c = 0; c < g.length(); c++){
            if(g.charAt(c) == nucleotide){
                i++;
            }
        }
        return i;
    }

    public static String findGenes(String dna, int startIndex){
        int start = -1;
        for (int i = startIndex; i<dna.length()-2; i++){
            if (dna.substring(i,i+3).equals("ATG")){
                start = i;
            }     
        }
        int end = findStopCodon(dna, startIndex);
        if (start!=-1 || end!=-1){
            return dna.substring(start, end+3);
        }
        return "No gene found.";
    }

    public static boolean potentialGene(String dna){
        if (dna.startsWith("ATG") && (dna.endsWith("TAG") || dna.endsWith("TAA") || dna.endsWith("TGA"))){
            if(dna.length()%3==0){
            return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        Gene g1 = new Gene("TCACATGAGCTATAA");
        String sampleGenome = "TCACATGAGCTATAA";
        String sample2 = "ATGGGGTAG";
        String sample3 = "CCCCCCCCCCCCCCCCCCCTAG";
        System.out.println(findStopCodon(sampleGenome, 15));
        System.out.println(countNucleotides(sampleGenome,'G'));
        System.out.println(findGenes(sample2,0));
        System.out.println(potentialGene(sample2));
        System.out.println(potentialGene(sample3));

    }
    
}

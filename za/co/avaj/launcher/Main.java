package com.avaj.launcher;

// import com.avaj.launcher.*;

// make re && java com.avaj.launcher.Main scenario.txt


public class Main {

    public static void main (String[] args) {

        if (args.length <= 0) {
            System.out.println("Usage: java com.avaj.launcher.Main scenario.txt");
            System.exit(-1);
        }
        else {
            System.out.println("___ MAIN");
        }
    }
}

// {{{

// try {
            // File inFile = new File(args[0]);
            // List<String> scenario = Files.readAllLines(Paths.get(inFile.getAbsolutePath()));
            // Path path = Paths.get(args[0]);
            // String read = Files.readAllLines(path);
            // byte[] strToBytes = str.getBytes();
            // Files.write(path, strToBytes);
            // List<String> scenario = Files.readAllLines(Paths.get(args[0]));
            // for (String line : scenario) {
            //     System.out.println(line);
            //     String[] temp = line.split(" ");
            //     for (String part : temp) {
            //         System.out.println(part);
            //     }
            // }
            // while (simCount-- > 0) {
            //     System.out.println(simCount);
            //     break;
            // }
            // int simCount = Integer.parseInt(scanner.nextLine());
            // ArrayList<String> scenario = new ArrayList<String>();
            // Scanner scanner = new Scanner(new File(inFile.getAbsolutePath()));
            // while (scanner.hasNextLine()) {
            //     scenario.add(scanner.nextLine());
            // }
            // scanner.close();

  // }}}

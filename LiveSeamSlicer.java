package uk.ac.nulondon;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Scanner;

public class LiveSeamSlicer {
    public static void main(String args[]) throws Exception{
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter file name: ");  
        String name = scanner.next(); 
        
        LinkedImage testImage = new LinkedImage(name);

        int width = 800;
        int height = 800;
        JFrame frame = new JFrame("Seam Slicing");
        frame.setSize(width, height);
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon(testImage.generateBufferedImage().getScaledInstance(width, height, Image.SCALE_SMOOTH)));
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int ogWidth = testImage.width;
        List<PixelNode> lowE;
        for (int i = 0; i < ogWidth-25; i++) {
            lowE = testImage.findLowestE();
            testImage.highlightSeam(lowE,Color.RED);
            label.setIcon(new ImageIcon(testImage.generateBufferedImage().getScaledInstance(width, height+i, Image.SCALE_SMOOTH)));
            testImage.removeSeam(lowE);
            label.setIcon(new ImageIcon(testImage.generateBufferedImage().getScaledInstance(width, height+i, Image.SCALE_SMOOTH)));

        }
        testImage.quit();




    }
}

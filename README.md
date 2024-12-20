# Image Seam Slicer

This project enhances a previous image compression program by adding the ability to remove vertical seams from PNG images. The initial goal was to create a program that identifies the most blue or lowest energy (least impact when removed) seam in an image, then removes it at the user's request (via the terminal). The user can also undo removals and save a final image. Seam removal and reinsertion needed to be O(n) time complexity. To further this project, I added the ability to watch multiple low energy seams be removed from the image in real time using JFrame.

### How To Use

For a live demo that visually shows an image being resized to 25% of its original width, run the "LiveDemo" class's main. Type the desired example image into the determinal (a set of options will be given).

To continuously edit the image by removing the bluest seam, removing the lowest enegy seam, or undoing, run the "UserInterface's" main. Follow instructions given in the terminal.

## Demo Video

[![Screenshot 2024-08-05 at 13 04 24](https://github.com/user-attachments/assets/2e35e7b2-ed67-40bf-82fb-14e4743308fe)](https://youtu.be/zpXWvhokJPs?si=XFfpx-X49Hldrjvf)


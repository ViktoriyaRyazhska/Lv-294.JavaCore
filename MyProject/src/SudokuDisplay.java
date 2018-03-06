import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SudokuDisplay extends JFrame {
    private static final int WIDTH = 394;
    private static final int HEIGHT = 440;
    private JPanel windowPanel;
    private SudokuLevel sudokuLevel;
    private Sudoku sudoku;
    protected SudokuBoard sBoard;

    JMenuBar menuBar;
    JMenu game;
    JMenuItem exit, about, newGame, submit;

    public SudokuDisplay() {
        super("Sudoku");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        sudoku = new Sudoku();
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        menuBar = new JMenuBar();
        game = new JMenu("Game");

        newGame = new JMenuItem("New");
        newGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int[][] puzzle = sBoard.getNewGame();
            }
        });

        submit = new JMenuItem("Submit");
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!sBoard.isComplete()) {
                    JOptionPane.showMessageDialog(SudokuDisplay.this, "Please complete your answer.");
                } else {
                    if (sBoard.checkSolution()) {
                        JOptionPane.showMessageDialog(SudokuDisplay.this, "Congratulation You won");
                    } else {
                        JOptionPane.showMessageDialog(SudokuDisplay.this, "Sorry, You have failed. ");
                    }
                }
            }
        });

        exit = new JMenuItem("Exit");
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        about = new JMenuItem("About");
        about.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(SudokuDisplay.this,
                        "      A standard Sudoku puzzle consists of a grid of 9 blocks." +
                                " Each block contains \n9 boxes arranged in 3 rows and 3 columns." +
                                "\n      There is only one valid solution to each Sudoku puzzle.The " +
                                "only way the puzzle \ncan be considered solved correctly is when" +
                                " all 81 boxes contain numbers and \nthe other Sudoku rules have " +
                                "been followed.	\n      When you start a game of Sudoku, some blocks" +
                                " will be pre-filled for you. You \ncannot change these numbers " +
                                "in the course of the game. \n      Each column/row/block must contain" +
                                " all of the numbers 1 through 9 and no \ntwo numbers in the same" +
                                " column/row/block of a Sudoku puzzle can be the same.",
                        "Sudoku Rules of Game", JOptionPane.PLAIN_MESSAGE);
            }
        });

        game.add(newGame);
        game.add(submit);

        game.addSeparator();
        game.add(exit);
        menuBar.add(game);
        menuBar.add(about);
        setJMenuBar(menuBar);

        windowPanel = new JPanel();
        windowPanel.setLayout(new FlowLayout(FlowLayout.LEADING));

        sBoard = new SudokuBoard();
        sBoard.addNotify();

        windowPanel.add(sBoard);

        add(windowPanel);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SudokuDisplay display = new SudokuDisplay();
                display.setVisible(true);
            }
        });
    }
}
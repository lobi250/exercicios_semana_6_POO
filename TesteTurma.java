import javax.swing.JOptionPane;

public class TesteTurma
{
   public static void main(String [] args)
   {
        String nome = JOptionPane.showInputDialog("Informe o nome da Turma: ");
        String curso = JOptionPane.showInputDialog("Informe o nome do curso: ");
        int quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de aluno da turma: "));
        int serie = Integer.parseInt(JOptionPane.showInputDialog("Informe a serie referente a turma: "));
        
        Turma t1 = new Turma(nome, curso, quantidadeDeAlunos, serie);
        
        JOptionPane.showMessageDialog(null, "Nome da turma: " +t1.getNome()+ "\nCurso: " +t1.getCurso()+ "\nQuantidade de alunos: " +t1.getQuantidadeDeAlunos()+ "\nSérie: " +t1.getSerie());
        
        quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Informe a nova quantidade de alunos: "));
        
        t1.setQuantidadeDeAlunos(quantidadeDeAlunos);
        
        JOptionPane.showMessageDialog(null, "Nome da turma: " +t1.getNome()+ "\nCurso: " +t1.getCurso()+ "\nQuantidade de alunos: " +t1.getQuantidadeDeAlunos()+ "\nSerie: " +t1.getSerie()); 
   }

}
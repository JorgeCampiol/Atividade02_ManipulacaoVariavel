public class Main {
    public static void main(String[] args) {
        //informaçoes da pessoa
        String nome = "Leni Campiol";
        int idade = 56;
        double salarioBrutoMensal = 3000.00;
        int mesesTrabalhados = 12;
        int quantidadeProdutosComprados = 10;
        double valorTotalCompras = 500.00;

        // Operação Simples
        double salarioAnualBruto = salarioBrutoMensal * mesesTrabalhados;
        double desconto = 2000.00;
        double salarioAnualLiquido = salarioAnualBruto - desconto;
        double mediaGastoPorProduto = valorTotalCompras / quantidadeProdutosComprados;
        String mensagem = "O nome da pessoa é " + nome + " e o salário anual líquido é R$ " + salarioAnualLiquido;

        //Resultados
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário Bruto Mensal: R$ " + salarioBrutoMensal);
        System.out.println("Meses Trabalhados: " + mesesTrabalhados);
        System.out.println("Quantidade de Produtos Comprados: " + quantidadeProdutosComprados);
        System.out.println("Valor Total de Compras: R$ " + valorTotalCompras);
        System.out.println("Salário Anual Bruto: R$ " + salarioAnualBruto);
        System.out.println("Salário Anual Líquido: R$ " + salarioAnualLiquido);
        System.out.println("Média Gasto por Produto: R$ " + mediaGastoPorProduto);
        System.out.println(mensagem);

    }
}
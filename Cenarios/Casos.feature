#language: PT

	User Story:
		EU COMO usuário do sistema.
		DESEJO realizar o cadastro de novos usuários.
		PARA QUE seja possível armazenar e gerenciar seus dados


	Feature: Página Cadastro de usuários

       
  	Scenario Outline: Acessar tela de cadastro de usuários.
		Dado que sou usuário do sistema.
		Quando Acesso a tela de cadastro de usuários.
		Então devo visualizar a página conforme tela 1 do escopo, contendo os campos Nome, E-mail, Senha e o botão Cadastrar.
		E não visualizando a tabela Usuários cadastrados.

	Scenario Outline: Realizar cadastro de usuário sem informar o campo Nome.
		Dado que acesso a página de cadastro.
		Quando submeto o meu cadastro sem o nome.
		Então devo ver abaixo no campo a mensagem informativa em vermelho "O campo Nome é obrigatório."

	Scenario Outline: Realizar cadastro de usuário sem informar o campo E-mail.
		Dado que acesso a página de cadastro.
		Quando submeto o meu cadastro sem o e-mail.
		Então devo ver abaixo do campo a mensagem informativa em vermelho "O campo E-mail é obrigatório."

	Scenario Outline: Realizar cadastro de usuário sem informar o campo Senha.
		Dado que acesso a página de cadastro.
		Quando submeto o meu cadastro sem a senha.
		Então devo ver abaixo do campo a mensagem informativa em vermelho "O campo Senha é obrigatório."

	Scenario Outline: Realizar cadastro de usuário sem informar os campos Nome, E-mail e Senha.
		Dado que acesso a página de cadastro.
		Quando submeto meu cadastro sem preencher os campos.
		Então devo ver abaixo de campo mensagem informativa em vermelho indicando que os campos são obrigatórios.

		
	Scenario Outline: Realizar cadastro de usuário informando no campo Nome valor invalido.
		Dado que acesso a página de cadastro.
		Quando submeto o meu cadastro sem o nome.
		Então devo ver abaixo no campo a mensagem informativa em vermelho "Por favor, insira um nome completo."
		

	Scenario Outline: Realizar cadastro de usuário informando no campo E-mail valor invalido.
		Dado que acesso a página de cadastro.
		Quando submeto o meu cadastro sem o e-mail.
		Então devo ver abaixo do campo a mensagem informativa em vermelho "Por favor, insira um e-mail válido."
		

	Scenario Outline: Realizar cadastro de usuário informando no campo Senha valor invalido.
		Dado que acesso a página de cadastro.
		Quando submeto o meu cadastro sem a senha.
		Então devo ver abaixo do campo a mensagem informativa em vermelho "A senha deve conter ao menos 8 caracteres."
		
	Scenario Outline: Realizar cadastro de usuário informando todos os campos corretamente.
		Dado que acesso a página de cadastro.
		Quando submeto o meu cadastro com nome, e-mail e senha corretos.
		Então devo ser cadastrado.

	Scenario Outline: Realizar exclusão de usuário.
		Dado que acesso a página de cadastro.
		Quando aciono a opção excluir de um usuário exibido na tabela Usuários cadastrados.
		Então devo ter o usuário excluído da tabela Usuários cadastrados.
		E devo visualizar os demais usuários com os mesmos ID de quando cadastrados.
      
      
      
      



USE [BancoFMB]
GO
/****** Object:  Table [dbo].[Agencia]    Script Date: 30/06/2018 00:23:53 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Agencia](
	[IDAgencia] [int] NOT NULL,
	[IDBanco] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[IDAgencia] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Banco]    Script Date: 30/06/2018 00:23:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Banco](
	[IDBanco] [int] IDENTITY(1,1) NOT NULL,
	[NmBanco] [varchar](20) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[IDBanco] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Clientes]    Script Date: 30/06/2018 00:23:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Clientes](
	[IDConta] [int] NOT NULL,
	[NmCliente] [varchar](70) NOT NULL,
	[Senha] [char](6) NOT NULL,
	[IDAgencia] [int] NOT NULL,
	[Saldo] [numeric](10, 2) NULL,
PRIMARY KEY CLUSTERED 
(
	[IDConta] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Operacoes]    Script Date: 30/06/2018 00:23:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Operacoes](
	[IDOperacao] [int] IDENTITY(1,1) NOT NULL,
	[DescOp] [varchar](20) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[IDOperacao] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Transacoes]    Script Date: 30/06/2018 00:23:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Transacoes](
	[IDTransacao] [int] IDENTITY(1,1) NOT NULL,
	[IDConta] [int] NOT NULL,
	[VMv] [numeric](10, 2) NOT NULL,
	[DtHr] [datetime] NOT NULL,
	[IDAgencia] [int] NOT NULL,
	[IDOperacao] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[IDTransacao] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Agencia]  WITH CHECK ADD FOREIGN KEY([IDBanco])
REFERENCES [dbo].[Banco] ([IDBanco])
GO
ALTER TABLE [dbo].[Clientes]  WITH CHECK ADD FOREIGN KEY([IDAgencia])
REFERENCES [dbo].[Agencia] ([IDAgencia])
GO
ALTER TABLE [dbo].[Transacoes]  WITH CHECK ADD FOREIGN KEY([IDAgencia])
REFERENCES [dbo].[Agencia] ([IDAgencia])
GO
ALTER TABLE [dbo].[Transacoes]  WITH CHECK ADD FOREIGN KEY([IDConta])
REFERENCES [dbo].[Clientes] ([IDConta])
GO
ALTER TABLE [dbo].[Transacoes]  WITH CHECK ADD FOREIGN KEY([IDOperacao])
REFERENCES [dbo].[Operacoes] ([IDOperacao])
GO

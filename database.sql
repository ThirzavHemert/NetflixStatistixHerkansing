USE [master]
GO
/****** Object:  Database [NetflixStatistix]    Script Date: 9-4-2020 16:43:21 ******/
CREATE DATABASE [NetflixStatistix]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'NetflixStatistix', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.MSSQLSERVER\MSSQL\DATA\NetflixStatistix.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'NetflixStatistix_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.MSSQLSERVER\MSSQL\DATA\NetflixStatistix_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
ALTER DATABASE [NetflixStatistix] SET COMPATIBILITY_LEVEL = 140
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [NetflixStatistix].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [NetflixStatistix] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [NetflixStatistix] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [NetflixStatistix] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [NetflixStatistix] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [NetflixStatistix] SET ARITHABORT OFF 
GO
ALTER DATABASE [NetflixStatistix] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [NetflixStatistix] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [NetflixStatistix] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [NetflixStatistix] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [NetflixStatistix] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [NetflixStatistix] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [NetflixStatistix] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [NetflixStatistix] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [NetflixStatistix] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [NetflixStatistix] SET  DISABLE_BROKER 
GO
ALTER DATABASE [NetflixStatistix] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [NetflixStatistix] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [NetflixStatistix] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [NetflixStatistix] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [NetflixStatistix] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [NetflixStatistix] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [NetflixStatistix] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [NetflixStatistix] SET RECOVERY FULL 
GO
ALTER DATABASE [NetflixStatistix] SET  MULTI_USER 
GO
ALTER DATABASE [NetflixStatistix] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [NetflixStatistix] SET DB_CHAINING OFF 
GO
ALTER DATABASE [NetflixStatistix] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [NetflixStatistix] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [NetflixStatistix] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'NetflixStatistix', N'ON'
GO
ALTER DATABASE [NetflixStatistix] SET QUERY_STORE = OFF
GO
USE [NetflixStatistix]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 9-4-2020 16:43:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[accountID] [int] NOT NULL,
	[accountName] [varchar](50) NOT NULL,
	[streetName] [varchar](50) NOT NULL,
	[houseNr] [varchar](8) NOT NULL,
	[zipCode] [varchar](20) NOT NULL,
	[residence] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[accountID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Episode]    Script Date: 9-4-2020 16:43:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Episode](
	[episodeID] [int] NOT NULL,
	[programID] [int] NOT NULL,
	[serieID] [int] NULL,
	[season] [int] NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Movie]    Script Date: 9-4-2020 16:43:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Movie](
	[movieID] [int] NOT NULL,
	[videoID] [int] NOT NULL,
	[genre] [varchar](50) NOT NULL,
	[language] [varchar](50) NOT NULL,
	[ageIndication] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Movie] PRIMARY KEY CLUSTERED 
(
	[movieID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Profile]    Script Date: 9-4-2020 16:43:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Profile](
	[profileID] [int] NOT NULL,
	[accountID] [int] NOT NULL,
	[profileName] [varchar](50) NOT NULL,
	[dateOfBirth] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Profile] PRIMARY KEY CLUSTERED 
(
	[profileID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Program]    Script Date: 9-4-2020 16:43:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Program](
	[programID] [int] NOT NULL,
	[programTitle] [varchar](50) NOT NULL,
	[programDuration] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Program] PRIMARY KEY CLUSTERED 
(
	[programID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Serie]    Script Date: 9-4-2020 16:43:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Serie](
	[serieID] [int] NOT NULL,
	[serieName] [varchar](50) NOT NULL,
	[ageIndication] [int] NOT NULL,
	[language] [varchar](50) NOT NULL,
	[genre] [varchar](50) NOT NULL,
	[similar] [int] NOT NULL,
 CONSTRAINT [PK_Serie] PRIMARY KEY CLUSTERED 
(
	[serieID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[WatchedProgram]    Script Date: 9-4-2020 16:43:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[WatchedProgram](
	[watchedID] [int] NOT NULL,
	[profileID] [int] NOT NULL,
	[programID] [int] NOT NULL,
	[percentage] [int] NOT NULL,
 CONSTRAINT [PK_WatchedProgram] PRIMARY KEY CLUSTERED 
(
	[watchedID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Account] ([accountID], [accountName], [streetName], [houseNr], [zipCode], [residence]) VALUES (0, N'J. Dean', N'Timber Wolf Trail', N'40', N'4616 KR', N'Denver')
INSERT [dbo].[Account] ([accountID], [accountName], [streetName], [houseNr], [zipCode], [residence]) VALUES (1, N'L. Reed', N'W Gray Street', N'21', N'4687 RG', N'Mississippi')
INSERT [dbo].[Account] ([accountID], [accountName], [streetName], [houseNr], [zipCode], [residence]) VALUES (2, N'C. Walker', N'Brown Terrace', N'189', N'3894 FS', N'New York')
INSERT [dbo].[Account] ([accountID], [accountName], [streetName], [houseNr], [zipCode], [residence]) VALUES (3, N'F. Craig', N'First Street', N'73', N'1120 PC', N'Washington D.C.')
INSERT [dbo].[Episode] ([episodeID], [programID], [serieID], [season]) VALUES (7, 1001, 1, 1)
INSERT [dbo].[Episode] ([episodeID], [programID], [serieID], [season]) VALUES (8, 1002, 1, 1)
INSERT [dbo].[Episode] ([episodeID], [programID], [serieID], [season]) VALUES (9, 1003, 1, 1)
INSERT [dbo].[Episode] ([episodeID], [programID], [serieID], [season]) VALUES (10, 1004, 1, 2)
INSERT [dbo].[Episode] ([episodeID], [programID], [serieID], [season]) VALUES (11, 1005, 1, 2)
INSERT [dbo].[Episode] ([episodeID], [programID], [serieID], [season]) VALUES (12, 1006, 1, 2)
INSERT [dbo].[Episode] ([episodeID], [programID], [serieID], [season]) VALUES (13, 1007, 1, 3)
INSERT [dbo].[Episode] ([episodeID], [programID], [serieID], [season]) VALUES (14, 1008, 1, 3)
INSERT [dbo].[Episode] ([episodeID], [programID], [serieID], [season]) VALUES (15, 1009, 1, 3)
INSERT [dbo].[Episode] ([episodeID], [programID], [serieID], [season]) VALUES (16, 2000, 2, 1)
INSERT [dbo].[Episode] ([episodeID], [programID], [serieID], [season]) VALUES (17, 2001, 2, 1)
INSERT [dbo].[Episode] ([episodeID], [programID], [serieID], [season]) VALUES (18, 2002, 2, 1)
INSERT [dbo].[Episode] ([episodeID], [programID], [serieID], [season]) VALUES (19, 2003, 2, 1)
INSERT [dbo].[Episode] ([episodeID], [programID], [serieID], [season]) VALUES (20, 2004, 2, 1)
INSERT [dbo].[Episode] ([episodeID], [programID], [serieID], [season]) VALUES (21, 2005, 2, 1)
INSERT [dbo].[Episode] ([episodeID], [programID], [serieID], [season]) VALUES (22, 2006, 2, 1)
INSERT [dbo].[Episode] ([episodeID], [programID], [serieID], [season]) VALUES (23, 2007, 2, 2)
INSERT [dbo].[Episode] ([episodeID], [programID], [serieID], [season]) VALUES (24, 2008, 2, 2)
INSERT [dbo].[Episode] ([episodeID], [programID], [serieID], [season]) VALUES (25, 2009, 2, 2)
INSERT [dbo].[Episode] ([episodeID], [programID], [serieID], [season]) VALUES (26, 3001, 3, 1)
INSERT [dbo].[Episode] ([episodeID], [programID], [serieID], [season]) VALUES (27, 3002, 3, 1)
INSERT [dbo].[Episode] ([episodeID], [programID], [serieID], [season]) VALUES (28, 3003, 3, 1)
INSERT [dbo].[Episode] ([episodeID], [programID], [serieID], [season]) VALUES (29, 3004, 3, 1)
INSERT [dbo].[Episode] ([episodeID], [programID], [serieID], [season]) VALUES (30, 3005, 3, 1)
INSERT [dbo].[Episode] ([episodeID], [programID], [serieID], [season]) VALUES (31, 3006, 3, 1)
INSERT [dbo].[Episode] ([episodeID], [programID], [serieID], [season]) VALUES (32, 3007, 3, 1)
INSERT [dbo].[Episode] ([episodeID], [programID], [serieID], [season]) VALUES (33, 3008, 3, 1)
INSERT [dbo].[Episode] ([episodeID], [programID], [serieID], [season]) VALUES (34, 3009, 3, 1)
INSERT [dbo].[Episode] ([episodeID], [programID], [serieID], [season]) VALUES (35, 3010, 3, 1)
INSERT [dbo].[Movie] ([movieID], [videoID], [genre], [language], [ageIndication]) VALUES (1, 1010, N'Detective', N'Engels', N'12 en ouder')
INSERT [dbo].[Movie] ([movieID], [videoID], [genre], [language], [ageIndication]) VALUES (2, 8001, N'Humor', N'Engels-Amerikaans', N'12 en ouder')
INSERT [dbo].[Movie] ([movieID], [videoID], [genre], [language], [ageIndication]) VALUES (3, 8002, N'Misdaad', N'Nederlands', N'16 en ouder')
INSERT [dbo].[Movie] ([movieID], [videoID], [genre], [language], [ageIndication]) VALUES (4, 8004, N'Erotiek', N'Engels-Amerikaans', N'18 en ouder')
INSERT [dbo].[Movie] ([movieID], [videoID], [genre], [language], [ageIndication]) VALUES (5, 8008, N'Misdaad', N'Engels-Amerikaans', N'16 en ouder')
INSERT [dbo].[Movie] ([movieID], [videoID], [genre], [language], [ageIndication]) VALUES (6, 8010, N'Western', N'Engels-Amerikaans', N'12 en ouder')
INSERT [dbo].[Movie] ([movieID], [videoID], [genre], [language], [ageIndication]) VALUES (7, 8011, N'Humor', N'Engels-Amerikaans', N'16 en ouder')
INSERT [dbo].[Profile] ([profileID], [accountID], [profileName], [dateOfBirth]) VALUES (30, 0, N'Spencer', N'2000-02-18')
INSERT [dbo].[Profile] ([profileID], [accountID], [profileName], [dateOfBirth]) VALUES (31, 0, N'Laura', N'2003-05-18')
INSERT [dbo].[Profile] ([profileID], [accountID], [profileName], [dateOfBirth]) VALUES (32, 1, N'Tim', N'1999-12-28')
INSERT [dbo].[Profile] ([profileID], [accountID], [profileName], [dateOfBirth]) VALUES (33, 1, N'Sasha', N'2002-07-10')
INSERT [dbo].[Profile] ([profileID], [accountID], [profileName], [dateOfBirth]) VALUES (34, 2, N'Gina', N'2005-02-16')
INSERT [dbo].[Profile] ([profileID], [accountID], [profileName], [dateOfBirth]) VALUES (35, 2, N'Hannah', N'2000-04-19')
INSERT [dbo].[Profile] ([profileID], [accountID], [profileName], [dateOfBirth]) VALUES (36, 3, N'Fiona', N'1986-07-30')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (1001, N'A Study In Pink', N'1:28')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (1002, N'The Blind Banker', N'1:28')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (1003, N'The Great Game', N'1:28')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (1004, N'A Scandal in Belgravia', N'1:28')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (1005, N'The Hounds Of BaskerVille', N'1:28')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (1006, N'The Reichenbach Fall', N'1:28')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (1007, N'The Empty Hearse', N'1:28')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (1008, N'The Sign Of Three', N'1:28')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (1009, N'His Last Vow', N'1:28')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (1010, N'The Abominal Bride', N'1:29')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (2000, N'Pilot', N'0:58')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (2001, N'Cats in the Bag', N'0:48')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (2002, N'And the Bags in the River', N'0:48')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (2003, N'Cancer Man', N'0:48')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (2004, N'Gray Matter', N'0:48')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (2005, N'Crazy Handful of Nothing', N'0:48')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (2006, N'A No-Rough-Stuff-Type Deal', N'0:48')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (2007, N'Seven Thirty-seven', N'0:48')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (2008, N'Grilled', N'0:48')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (2009, N'Bit by a Dead Bee', N'0:48')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (3001, N'The Crocodiles Dilemma', N'1:08')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (3002, N'The Rooster Prince', N'1:08')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (3003, N'A Muddy Road', N'1:08')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (3004, N'Eating the Blame', N'1:08')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (3005, N'The Six Ungraspables', N'1:08')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (3006, N'Buridans Ass', N'1:08')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (3007, N'Who Shaves The Barber', N'1:08')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (3008, N'The Heap', N'1:08')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (3009, N'A Fox, A Rabbit, and a Cabbage', N'1:08')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (3010, N'Mortons Fork', N'1:08')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (8001, N'The Life Of Brian', N'1:34')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (8002, N'Pulp Fiction', N'2:34')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (8004, N'PruimeBloesem', N'1:20')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (8008, N'Resevoir Dogs', N'1:39')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (8010, N'The Good, the Bad and the Ugly', N'2:41')
INSERT [dbo].[Program] ([programID], [programTitle], [programDuration]) VALUES (8011, N'And Warhols Dracula', N'1:43')
INSERT [dbo].[Serie] ([serieID], [serieName], [ageIndication], [language], [genre], [similar]) VALUES (1, N'Sherlock', 12, N'Engels', N'Detective', 4)
INSERT [dbo].[Serie] ([serieID], [serieName], [ageIndication], [language], [genre], [similar]) VALUES (2, N'Breaking Bad', 16, N'Engels-Amerikaans', N'Spanning', 3)
INSERT [dbo].[Serie] ([serieID], [serieName], [ageIndication], [language], [genre], [similar]) VALUES (3, N'Fargo', 16, N'Engels-Amerikaans', N'Spanning', 2)
INSERT [dbo].[WatchedProgram] ([watchedID], [profileID], [programID], [percentage]) VALUES (16, 30, 2007, 45)
INSERT [dbo].[WatchedProgram] ([watchedID], [profileID], [programID], [percentage]) VALUES (17, 30, 2008, 10)
INSERT [dbo].[WatchedProgram] ([watchedID], [profileID], [programID], [percentage]) VALUES (18, 35, 1003, 89)
INSERT [dbo].[WatchedProgram] ([watchedID], [profileID], [programID], [percentage]) VALUES (19, 34, 8008, 42)
INSERT [dbo].[WatchedProgram] ([watchedID], [profileID], [programID], [percentage]) VALUES (20, 32, 8010, 27)
INSERT [dbo].[WatchedProgram] ([watchedID], [profileID], [programID], [percentage]) VALUES (21, 32, 1009, 50)
ALTER TABLE [dbo].[Episode]  WITH CHECK ADD  CONSTRAINT [FK_ProgramID_Program] FOREIGN KEY([programID])
REFERENCES [dbo].[Program] ([programID])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Episode] CHECK CONSTRAINT [FK_ProgramID_Program]
GO
ALTER TABLE [dbo].[Episode]  WITH CHECK ADD  CONSTRAINT [FK_SerieID_Serie] FOREIGN KEY([serieID])
REFERENCES [dbo].[Serie] ([serieID])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Episode] CHECK CONSTRAINT [FK_SerieID_Serie]
GO
ALTER TABLE [dbo].[Movie]  WITH CHECK ADD  CONSTRAINT [FK_ProgramID] FOREIGN KEY([videoID])
REFERENCES [dbo].[Program] ([programID])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Movie] CHECK CONSTRAINT [FK_ProgramID]
GO
ALTER TABLE [dbo].[Profile]  WITH CHECK ADD  CONSTRAINT [FK_AccountID] FOREIGN KEY([accountID])
REFERENCES [dbo].[Account] ([accountID])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Profile] CHECK CONSTRAINT [FK_AccountID]
GO
ALTER TABLE [dbo].[WatchedProgram]  WITH CHECK ADD  CONSTRAINT [FK_Profile] FOREIGN KEY([profileID])
REFERENCES [dbo].[Profile] ([profileID])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[WatchedProgram] CHECK CONSTRAINT [FK_Profile]
GO
ALTER TABLE [dbo].[WatchedProgram]  WITH CHECK ADD  CONSTRAINT [FK_Program] FOREIGN KEY([programID])
REFERENCES [dbo].[Program] ([programID])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[WatchedProgram] CHECK CONSTRAINT [FK_Program]
GO
USE [master]
GO
ALTER DATABASE [NetflixStatistix] SET  READ_WRITE 
GO

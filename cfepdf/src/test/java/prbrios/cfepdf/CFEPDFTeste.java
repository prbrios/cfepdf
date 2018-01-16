package prbrios.cfepdf;

import java.io.File;

public class CFEPDFTeste {

	public static void main(String[] args) {
		try {
			
			CFEPDFImpressao imp = new CFEPDFImpressao();
			
			CFEPDF c = new CFEPDF();
			c.setRetornoSAT("973056|06000|0000|Emitido com sucesso|||PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiPz48Q0ZlPjxpbmZDRmUgSWQ9IkNGZTIzMTgwMTA1MzU2MTY3MDAwMjk0NTkyMzAwMDU2NDgwMDAwMDE0ODc0ODczIiB2ZXJzYW89IjAuMDciIHZlcnNhb0RhZG9zRW50PSIwLjA3IiB2ZXJzYW9TQj0iMDEwMDAwIj48aWRlPjxjVUY+MjM8L2NVRj48Y05GPjQ4NzQ4NzwvY05GPjxtb2Q+NTk8L21vZD48bnNlcmllU0FUPjIzMDAwNTY0ODwvbnNlcmllU0FUPjxuQ0ZlPjAwMDAwMTwvbkNGZT48ZEVtaT4yMDE4MDExNTwvZEVtaT48aEVtaT4xNTQwMzI8L2hFbWk+PGNEVj4zPC9jRFY+PHRwQW1iPjE8L3RwQW1iPjxDTlBKPjAxMzAyODgyMDAwMTAyPC9DTlBKPjxzaWduQUM+UjY3cVlVZXQxZzFrTThyTktoNlJSS3RKZ0premRLdUt2QVNsa0w3dWNnbDllb25yVE9kdU45K1kyRjVPTlZLN1lMMGkvcDR2T2szN2IrQlkrbWw4MlJYSEl5aUlEaVJEblVwU09wRm14MDJwMEhBTWhsQktHTi90eGlvL2EvQU1mb0NSM2w4R2hFVjc0dGM1b2dYQytVRCtsNGtWRTF1S3RQUytnRllyM09FL3ZCSmRrbXZ1RUNSTkZ6bkxBU25MZHY3NWEvVzNRQ1lkY3F0V0lsNmFDS1QwMjdJMHlSM3I4OEhtV2w2YTY2R0pROFg5NmlSc2tPQ1RzNklqa1FCMm05VkliSmx6OEdXQXVVa2VZSzhMaTAxY0ViMHlFVlIvQzJvSHJLamlwbFlKZVNCK2Vadmp4NDB0N2swN0FuS01IOXdMcWRQY0pkUVB4ZDZ1R0czaXNRPT08L3NpZ25BQz48YXNzaW5hdHVyYVFSQ09ERT5rYU5wT3hLc3p6dUU2TzNmOTF3WVg5VnhJdGpEN0lMd2s4V2lDUHo4aTl0NG1aTUUvYmUrSVljbFJlMjR3RnRKSFh2MXF1RFFjVno5WWluUi9PbUlMNlYvdUJoNG1Nb0JwS1JwSmhWaDJ6YUwxdHI2bGttMkNJUlNEWFhaRmpWWVF2ZzhPNGZ0NC92Ui9Yb1NxdjlrdFc5UjFlRkwveGpxbmp3SWNudzhLNmNFK1kzRHlNRm5heWhLbGxwdmQxSFJyeXMzeWRYRlBuRXFCUHZMUmdvckFXWEFNMEJnbGpDL2FtY0ZPQXhkQU00U2V4TjU4bUVkK3ZKeWwzb0dxV0JXYitGdVA3S0d0dmVxSHNBSEI4YjArbzJKN1BzVEgycmJnbERhUkY2VzhVMEJoZ3BlUlp6NzQvOXJPUWpxTWNuaUVoTE00Y1JzVGRnUUs3RStUU3RXQ1E9PTwvYXNzaW5hdHVyYVFSQ09ERT48bnVtZXJvQ2FpeGE+MDAxPC9udW1lcm9DYWl4YT48L2lkZT48ZW1pdD48Q05QSj4wNTM1NjE2NzAwMDI5NDwvQ05QSj48eE5vbWU+U0FNUEFJTyBGSUxITyBDT01FUkNJTyBERSBURUNJRE9TIExUREE8L3hOb21lPjx4RmFudD5BUk1BWkVNIEdVQU5BQkFSQTwveEZhbnQ+PGVuZGVyRW1pdD48eExncj5SIENFTC4gRVJORVNUTyBERU9DTEVDSUFOTzwveExncj48bnJvPjAwNDQyPC9ucm8+PHhCYWlycm8+Q0VOVFJPPC94QmFpcnJvPjx4TXVuPlNPQlJBTDwveE11bj48Q0VQPjYyMDExMDUwPC9DRVA+PC9lbmRlckVtaXQ+PElFPjA2ODcwODg2NiAgIDwvSUU+PGNSZWdUcmliPjM8L2NSZWdUcmliPjxpbmRSYXRJU1NRTj5OPC9pbmRSYXRJU1NRTj48L2VtaXQ+PGRlc3QvPjxkZXQgbkl0ZW09IjEiPjxwcm9kPjxjUHJvZD4zNDI2PC9jUHJvZD48eFByb2Q+VFdPV0FZIFNQQU5ERVggOTRQT0w2RUxBU1QxLjUwICBHRVJBTDwveFByb2Q+PE5DTT41NDA3NTEwMDwvTkNNPjxDRk9QPjU0MDM8L0NGT1A+PHVDb20+TVRTPC91Q29tPjxxQ29tPjEuMDAwMDwvcUNvbT48dlVuQ29tPjEzLjM4PC92VW5Db20+PHZQcm9kPjEzLjM4PC92UHJvZD48aW5kUmVncmE+QTwvaW5kUmVncmE+PHZJdGVtPjEzLjM4PC92SXRlbT48L3Byb2Q+PGltcG9zdG8+PElDTVM+PElDTVM0MD48T3JpZz4xPC9PcmlnPjxDU1Q+NjA8L0NTVD48L0lDTVM0MD48L0lDTVM+PFBJUz48UElTQWxpcT48Q1NUPjAxPC9DU1Q+PHZCQz4xMy4zODwvdkJDPjxwUElTPjAuMDA2NTwvcFBJUz48dlBJUz4wLjA5PC92UElTPjwvUElTQWxpcT48L1BJUz48Q09GSU5TPjxDT0ZJTlNBbGlxPjxDU1Q+MDE8L0NTVD48dkJDPjEzLjM4PC92QkM+PHBDT0ZJTlM+MC4wMzAwPC9wQ09GSU5TPjx2Q09GSU5TPjAuNDA8L3ZDT0ZJTlM+PC9DT0ZJTlNBbGlxPjwvQ09GSU5TPjwvaW1wb3N0bz48L2RldD48dG90YWw+PElDTVNUb3Q+PHZJQ01TPjAuMDA8L3ZJQ01TPjx2UHJvZD4xMy4zODwvdlByb2Q+PHZEZXNjPjAuMDA8L3ZEZXNjPjx2UElTPjAuMDk8L3ZQSVM+PHZDT0ZJTlM+MC40MDwvdkNPRklOUz48dlBJU1NUPjAuMDA8L3ZQSVNTVD48dkNPRklOU1NUPjAuMDA8L3ZDT0ZJTlNTVD48dk91dHJvPjAuMDA8L3ZPdXRybz48L0lDTVNUb3Q+PHZDRmU+MTMuMzg8L3ZDRmU+PC90b3RhbD48cGd0bz48TVA+PGNNUD4wMTwvY01QPjx2TVA+MTMuMzg8L3ZNUD48L01QPjx2VHJvY28+MC4wMDwvdlRyb2NvPjwvcGd0bz48L2luZkNGZT48U2lnbmF0dXJlIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwLzA5L3htbGRzaWcjIj48U2lnbmVkSW5mbz48Q2Fub25pY2FsaXphdGlvbk1ldGhvZCBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnL1RSLzIwMDEvUkVDLXhtbC1jMTRuLTIwMDEwMzE1Ii8+PFNpZ25hdHVyZU1ldGhvZCBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvMDQveG1sZHNpZy1tb3JlI3JzYS1zaGEyNTYiLz48UmVmZXJlbmNlIFVSST0iI0NGZTIzMTgwMTA1MzU2MTY3MDAwMjk0NTkyMzAwMDU2NDgwMDAwMDE0ODc0ODczIj48VHJhbnNmb3Jtcz48VHJhbnNmb3JtIEFsZ29yaXRobT0iaHR0cDovL3d3dy53My5vcmcvMjAwMC8wOS94bWxkc2lnI2VudmVsb3BlZC1zaWduYXR1cmUiLz48VHJhbnNmb3JtIEFsZ29yaXRobT0iaHR0cDovL3d3dy53My5vcmcvVFIvMjAwMS9SRUMteG1sLWMxNG4tMjAwMTAzMTUiLz48L1RyYW5zZm9ybXM+PERpZ2VzdE1ldGhvZCBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvMDQveG1sZW5jI3NoYTI1NiIvPjxEaWdlc3RWYWx1ZT50RmZ0K2YxS3V1aHFZQXNoN3lnNHBMdGkrU25zV3NSL0J1Sm50MXpRQnRrPTwvRGlnZXN0VmFsdWU+PC9SZWZlcmVuY2U+PC9TaWduZWRJbmZvPjxTaWduYXR1cmVWYWx1ZT5OaFRpMUxBU1kvNEo1VDZvQWpLSmt6amkwQmMyS0I2VDhCdmZFNVF1Vkd3enU3cDNzampaRHB2djZPWGdWa0EzS0pCR20xNFZCODEyb2s2SnhRcWZVanZOOUxpNmU4Q1pHZUYzMy9hVzEyRUc1UHFHc0pWQkx6SnF6T1BsM24rSVFqdjBON3lneTVBNUZDK3gvNkpKWDNXTWVxbzA4NFhSY3VheWZ5dURRaUZpSG9ETnNPcXNSVi9UYkZLeW5iRVdXZHlTdk5TbGVUZDA3UURJZUdhdkRpU0dDTzBMQllaQTZIbFJRQ0JNVWFVc0gvRi9YcTk4bnBIdEJJTG4vWFJ5aXlVVzRiTUpxSnRxc2ZPUkh1K0pyYVZ5VDRjZ1lObG45VXFXN21NeHpCYjRYc0Vac0RMbXJUUno0cHd5M3pSSldZaGIrWWJGVGcrYVRHNnZoRWtGNlE9PTwvU2lnbmF0dXJlVmFsdWU+PEtleUluZm8+PFg1MDlEYXRhPgo8WDUwOUNlcnRpZmljYXRlPk1JSURuVENDQW9XZ0F3SUJBZ0lFSXprczNEQU5CZ2txaGtpRzl3MEJBUXNGQURCWU1Rc3dDUVlEVlFRR0V3SmljakVMTUFrR0ExVUVDQXdDYzNBeEREQUtCZ05WQkFjTUEzTnFZekVRTUE0R0ExVUVDZ3dIWTI5dGNITnBjekVNTUFvR0ExVUVDd3dEWkdWMk1RNHdEQVlEVlFRRERBVnpaV1poZWpBZUZ3MHhPREF4TVRJeU1ERXpORGRhRncweU1EQXhNVE15TURFek5EZGFNSUhJTVFzd0NRWURWUVFHRXdKQ1VqRU9NQXdHQTFVRUNBd0ZRMlZoY21FeEVUQVBCZ05WQkFvTUNGTkZSa0ZhTFVORk1SZ3dGZ1lEVlFRTERBOUJReUJUUVZRZ1UwVkdRVm9nUTBVeEtEQW1CZ05WQkFzTUgwRjFkRzl5YVdSaFpHVWdaR1VnVW1WbmFYTjBjbThnVTBWR1FWb2dRMFV4UGpBOEJnTlZCQU1NTlZOQlRWQkJTVThnUmtsTVNFOGdRMDlOUlZKRFNVOGdSRVVnVkVWRFNVUlBVeUJNVkVSQk9qQTFNelUyTVRZM01EQXdNamswTVJJd0VBWURWUVFGRXdreU16QXdNRFUyTkRnd2dnRWlNQTBHQ1NxR1NJYjNEUUVCQVFVQUE0SUJEd0F3Z2dFS0FvSUJBUUNiOXZtUGlsZVBLRFFQck92ZzFDSkdvdlJBZU41MnkraURYM1F6T1pDUW1NSDFJZUdwOURJQ1FZb2ZEUE1VeHJYVWRySW5Nb3dZRmxTK0ZXZlBZUncrVDVwRTVBK1FPSm1scDNoWjdvaVFHSWxFd3pnNXBlRU5qSXNTMktQSE5ENEkvWHQ1WHdBS2JueVd0MU1aWkxRd24xL2ZaT0xZUGN6M2JBRmtia2hIbGw5NnAyMFNRTGZJNmhRVElpN2ZtTUg0Q2JmNEhHSEpIZS9RZlMzY3NKczBYQzNPLzFKSURvRTdOZVBJT1lSUlh4cDNaU0Nyc281NUVMVUt5SGY1T3Z3WjJaUHZENjd2Q1phcmdpeVV2bi8vWWxsbWJqeHhhYUYzaXRXbWVYd1gwb0tTVTZYc3ZFbW1Dcllhb2VjQis0ZUlieEErKzBJb3RIazVvYkd1SHAxVkFnTUJBQUV3RFFZSktvWklodmNOQVFFTEJRQURnZ0VCQUJsL3kxbnA1MldtVkVBYXoxL0NVdWp5OUJzRUtobE96eEtGTEJSWEpvYk1rSGdoVEFRVWdEdmJtY3lMRTFzL0RRc1dMbUVPcnF6c0JTdXZiWUdNWG83WlgySG43VnJKN3dMQUhBaHV2U1gzRVFyaTJpVCtIUUV2L296YlFpMDJCSmo3SWExTnY4dGtjdXlrZlZSTC8vYjhrMk16S3NWSGpmbWdqMWZpNUg2eEMxYUZKTE4vK1VOdHUvN2xDQXlyaitnRzhLR2JyeW16U2Y0ZEZuQ2c1V1U3WjZ6ekZvRHQvMU81Rnp5QVZGNllSWTU5R0RTQU5sTzN6YmNhZGlCUlRVakgvaDIvNjF3aVMzeTRDbmJ6aFBTZFVMK3FURld4eUpiV1M2RnR5cGNtQlZhMmJWRGc4N1JETi9ubVJzd1dlbzNwUzhlM3hITnZyc3ZRdThwYzhNRT08L1g1MDlDZXJ0aWZpY2F0ZT4KPC9YNTA5RGF0YT48L0tleUluZm8+PC9TaWduYXR1cmU+PC9DRmU+Cg==|20180115154032|CFe23180105356167000294592300056480000014874873|13.38||kaNpOxKszzuE6O3f91wYX9VxItjD7ILwk8WiCPz8i9t4mZME/be+IYclRe24wFtJHXv1quDQcVz9YinR/OmIL6V/uBh4mMoBpKRpJhVh2zaL1tr6lkm2CIRSDXXZFjVYQvg8O4ft4/vR/XoSqv9ktW9R1eFL/xjqnjwIcnw8K6cE+Y3DyMFnayhKllpvd1HRrys3ydXFPnEqBPvLRgorAWXAM0BgljC/amcFOAxdAM4SexN58mEd+vJyl3oGqWBWb+FuP7KGtveqHsAHB8b0+o2J7PsTH2rbglDaRF6W8U0BhgpeRZz74/9rOQjqMcniEhLM4cRsTdgQK7E+TStWCQ==");
			c.gerarPdfAutorizacao();
			String arquivo = c.getSaida();
			Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + new File(arquivo));
			
			//String xml = "000229|06000|0000|Emitido com sucesso + conteudo notas.|||PENGZT48aW5mQ0ZlIElkPSJDRmUzNTE4MDEwODcyMzIxODAwMDE4NjU5OTAwMDE0MDUyMDAwMTg3MzM4OTQ0OCIgdmVyc2FvPSIwLjA3IiB2ZXJzYW9EYWRvc0VudD0iMC4wNyIgdmVyc2FvU0I9IjAxMDAwMCI+PGlkZT48Y1VGPjM1PC9jVUY+PGNORj4zMzg5NDQ8L2NORj48bW9kPjU5PC9tb2Q+PG5zZXJpZVNBVD45MDAwMTQwNTI8L25zZXJpZVNBVD48bkNGZT4wMDAxODc8L25DRmU+PGRFbWk+MjAxODAxMDQ8L2RFbWk+PGhFbWk+MDk1MzI5PC9oRW1pPjxjRFY+ODwvY0RWPjx0cEFtYj4yPC90cEFtYj48Q05QSj4xNjcxNjExNDAwMDE3MjwvQ05QSj48c2lnbkFDPlNHUi1TQVQgU0lTVEVNQSBERSBHRVNUQU8gRSBSRVRBR1VBUkRBIERPIFNBVDwvc2lnbkFDPjxhc3NpbmF0dXJhUVJDT0RFPnF0OUEwNzJscXdGZXZXRy9ncU5kUW1qZ3Z6RXZPcE14TTNCN1ptdkI2M2l0alE2bFVyVmZrT2J0S21HTUx1aksxN1dvMWFJS0ZTMHByVUtqdC9aNENaalpIVHFtazc5a00vUWt1QjFDNFMyV1p4WTRPWFh5K2hsaUI1dzh0WkcxVS83V2U5TDMrNGhETVNUcnBTYXljZHM4cWRneUpCSGFvelFXSFU4S1ZSTUVnNm96eVJETjk4NWVkT25xR0pSSkhHMmYyUFNYUW16SllRemFJZ1VIWWx3TkJaaFhBVE16b2RpY1ZIOCtoUTZOdktOTW5XMU8wOVY3MW1rZTAxK040cEt0SkJ6N1lxdGNncWFqT2ErbmRuMDhueGhCZU5sTDhhRlZUeDBJTHhNMlM4NkNnY0t2S0FoTHMxS2ovMWQxOHR0bGpQWlVuWGtRKzdiRUhEYUh6QT09PC9hc3NpbmF0dXJhUVJDT0RFPjxudW1lcm9DYWl4YT4wMDE8L251bWVyb0NhaXhhPjwvaWRlPjxlbWl0PjxDTlBKPjA4NzIzMjE4MDAwMTg2PC9DTlBKPjx4Tm9tZT5UQU5DQSBJTkZPUk1BVElDQSBFSVJFTEk8L3hOb21lPjx4RmFudD5UQU5DQTwveEZhbnQ+PGVuZGVyRW1pdD48eExncj5SVUEgTUFSRUNIQUwgRkxPUklBTk8gUEVJWE9UTzwveExncj48bnJvPjE2NjwvbnJvPjx4QmFpcnJvPlZJTEEgTUFSQ09OREVTPC94QmFpcnJvPjx4TXVuPlBSRVNJREVOVEUgUFJVREVOVEU8L3hNdW4+PENFUD4xOTAzMDAyMDwvQ0VQPjwvZW5kZXJFbWl0PjxJRT41NjIzNzcxMTExMTE8L0lFPjxjUmVnVHJpYj4zPC9jUmVnVHJpYj48aW5kUmF0SVNTUU4+TjwvaW5kUmF0SVNTUU4+PC9lbWl0PjxkZXN0PjwvZGVzdD48ZGV0IG5JdGVtPSIxIj48cHJvZD48Y1Byb2Q+MTwvY1Byb2Q+PGNFQU4+MDAxMjM0NTY3ODkwNTwvY0VBTj48eFByb2Q+UFJPRFVUTyBURVNURTwveFByb2Q+PE5DTT4zMDA0MzkyOTwvTkNNPjxDRk9QPjUxMDI8L0NGT1A+PHVDb20+VU48L3VDb20+PHFDb20+MS4wMDAwPC9xQ29tPjx2VW5Db20+NC40MDwvdlVuQ29tPjx2UHJvZD40LjQwPC92UHJvZD48aW5kUmVncmE+QTwvaW5kUmVncmE+PHZJdGVtPjQuNDA8L3ZJdGVtPjx2UmF0RGVzYz4wLjAwPC92UmF0RGVzYz48dlJhdEFjcj4wLjAwPC92UmF0QWNyPjwvcHJvZD48aW1wb3N0bz48dkl0ZW0xMjc0MT4yLjAwPC92SXRlbTEyNzQxPjxJQ01TPjxJQ01TU04xMDI+PE9yaWc+MDwvT3JpZz48Q1NPU04+MTAyPC9DU09TTj48L0lDTVNTTjEwMj48L0lDTVM+PFBJUz48UElTQWxpcT48Q1NUPjAxPC9DU1Q+PHZCQz40LjQwPC92QkM+PHBQSVM+MC4wMTY1PC9wUElTPjx2UElTPjAuMDc8L3ZQSVM+PC9QSVNBbGlxPjwvUElTPjxDT0ZJTlM+PENPRklOU0FsaXE+PENTVD4wMTwvQ1NUPjx2QkM+NC40MDwvdkJDPjxwQ09GSU5TPjAuMDc2MDwvcENPRklOUz48dkNPRklOUz4wLjMzPC92Q09GSU5TPjwvQ09GSU5TQWxpcT48L0NPRklOUz48L2ltcG9zdG8+PC9kZXQ+PHRvdGFsPjxJQ01TVG90Pjx2SUNNUz4wLjAwPC92SUNNUz48dlByb2Q+NC40MDwvdlByb2Q+PHZEZXNjPjAuMDA8L3ZEZXNjPjx2UElTPjAuMDc8L3ZQSVM+PHZDT0ZJTlM+MC4zMzwvdkNPRklOUz48dlBJU1NUPjAuMDA8L3ZQSVNTVD48dkNPRklOU1NUPjAuMDA8L3ZDT0ZJTlNTVD48dk91dHJvPjAuMDA8L3ZPdXRybz48L0lDTVNUb3Q+PHZDRmU+NC40MDwvdkNGZT48dkNGZUxlaTEyNzQxPjIuMDA8L3ZDRmVMZWkxMjc0MT48L3RvdGFsPjxwZ3RvPjxNUD48Y01QPjAxPC9jTVA+PHZNUD40LjQwPC92TVA+PC9NUD48dlRyb2NvPjAuMDA8L3ZUcm9jbz48L3BndG8+PGluZkFkaWM+PGluZkNwbD5OYW8gQWNlaXRhbW9zIERldm9sdWNvZXMgc2VtIGVzdGUgQ29tcHJvdmFudGU8L2luZkNwbD48b2JzRmlzY28geENhbXBvPSIxMjM0NTY3ODkwMTIzNDU2Nzg5MCI+PHhUZXh0bz4xMjM0NTY3ODkwMTIzNDU2Nzg5MDEyMzQ1Njc4OTAxMjM0NTY3ODkwMTIzNDU2Nzg5MDEyMzQ1Njc4OTA8L3hUZXh0bz48L29ic0Zpc2NvPjwvaW5mQWRpYz48L2luZkNGZT48U2lnbmF0dXJlIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwLzA5L3htbGRzaWcjIj48U2lnbmVkSW5mbz48Q2Fub25pY2FsaXphdGlvbk1ldGhvZCBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnL1RSLzIwMDEvUkVDLXhtbC1jMTRuLTIwMDEwMzE1Ij48L0Nhbm9uaWNhbGl6YXRpb25NZXRob2Q+PFNpZ25hdHVyZU1ldGhvZCBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvMDQveG1sZHNpZy1tb3JlI3JzYS1zaGEyNTYiPjwvU2lnbmF0dXJlTWV0aG9kPjxSZWZlcmVuY2UgVVJJPSIjQ0ZlMzUxODAxMDg3MjMyMTgwMDAxODY1OTkwMDAxNDA1MjAwMDE4NzMzODk0NDgiPjxUcmFuc2Zvcm1zPjxUcmFuc2Zvcm0gQWxnb3JpdGhtPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwLzA5L3htbGRzaWcjZW52ZWxvcGVkLXNpZ25hdHVyZSI+PC9UcmFuc2Zvcm0+PFRyYW5zZm9ybSBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnL1RSLzIwMDEvUkVDLXhtbC1jMTRuLTIwMDEwMzE1Ij48L1RyYW5zZm9ybT48L1RyYW5zZm9ybXM+PERpZ2VzdE1ldGhvZCBBbGdvcml0aG09Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvMDQveG1sZW5jI3NoYTI1NiI+PC9EaWdlc3RNZXRob2Q+PERpZ2VzdFZhbHVlPlY0ejgwLzZ6NVNDSWE1ZWxxdnF5UkFkY0hVSEVpSU10SXhsQnlLWEZWcGs9PC9EaWdlc3RWYWx1ZT48L1JlZmVyZW5jZT48L1NpZ25lZEluZm8+PFNpZ25hdHVyZVZhbHVlPlRRemE4dUtrOFlyUHRYQ3ZyT2szQ0NRWWlFLzFmbUtjNnJONTEwL043ZjVtQW4zUEM2b1NrNFh4UnNDUkN6ZXhuVndpUmt1NjM3MGZqK3IyaTI2NlViQk4zSmNUSmVVT2g5Z0h2NVBXZWsyb2p1ZGVBU0htWUVhNEZVR2U2NHhMQUprZi9jVHdnbm5JajBkMDVZV0ZDcjRaTzJBa1pDT0ErYkw4ZWNHTVFSMTJUTE5GVCtYSU5vZ1NqREo0ZVQwTVpFcXkrR2FYSkFrNTdINEU1T3JGRm9NdjdPOHNCemdrY1JaYy9IUU9PTUtlYWNRSHhLMmpzQVF5L3JZL3h4cDRKUHBvMWtIOFBXZUNYdjNGeDdESXg4Q2pUVnBUNVRvZDFNZDdUN0FUcWZaVWdmUGI1ckFpRFd1OVUyVFo2L2hqOTQzQWUxa2E4Z2gydi9EMEFkamdtUT09PC9TaWduYXR1cmVWYWx1ZT48S2V5SW5mbz48WDUwOURhdGE+PFg1MDlDZXJ0aWZpY2F0ZT5NSUlHc0RDQ0JKaWdBd0lCQWdJSkFTSHhaZVZUeUpnVk1BMEdDU3FHU0liM0RRRUJDd1VBTUdjeEN6QUpCZ05WQkFZVEFrSlNNVFV3TXdZRFZRUUtFeXhUWldOeVpYUmhjbWxoSUdSaElFWmhlbVZ1WkdFZ1pHOGdSWE4wWVdSdklHUmxJRk5oYnlCUVlYVnNiekVoTUI4R0ExVUVBeE1ZUVVNZ1UwRlVJR1JsSUZSbGMzUmxJRk5GUmtGYUlGTlFNQjRYRFRFM01URXlNREV6TWpZek5Wb1hEVEl5TVRFeU1ERXpNall6TlZvd2diVXhFakFRQmdOVkJBVVRDVGt3TURBeE5EQTFNakVMTUFrR0ExVUVCaE1DUWxJeEVqQVFCZ05WQkFnVENWTkJUeUJRUVZWTVR6RVJNQThHQTFVRUNoTUlVMFZHUVZvdFUxQXhEekFOQmdOVkJBc1RCa0ZETFZOQlZERW9NQ1lHQTFVRUN4TWZRWFYwWlc1MGFXTmhaRzhnY0c5eUlFRlNJRk5GUmtGYUlGTlFJRk5CVkRFd01DNEdBMVVFQXhNblZFRk9RMEVnU1U1R1QxSk5RVlJKUTBFZ1JVbFNSVXhKT2pBNE56SXpNakU0TURBd01UZzJNSUlCSWpBTkJna3Foa2lHOXcwQkFRRUZBQU9DQVE4QU1JSUJDZ0tDQVFFQXZHbXcra0pPclBVTnpCVTFDNWorNTY5YmpSWW5xQWNyYTEyWXF5UVFJeUM0MFU2YWR5R0c2dzJrTjJRNDBrR0dYNGNDeEJ5aUsyUXg4TThNajdLWmJMS0hEeis4OENFdmJmY1c2ckEzVW5sRkFOd1N6RnhZZ3VNVGhpM0UxZmV0ejNmSHp6RTJRZlV0TDduNHFYQ2kxYVlXUEVQaXJWTWNVaG1SVzJ1M0xVNmRqV1JXRzNIZHJybkhEcC9VdEFRRU95MUhzd0VjYTlyRjYzanh3aUtXRXlubVJmU2lxQ3ZvRzlyamgyNWh1ZHZGaTJnRWlIN0F6eGU0SnBXLzNhcnY4THZBdkgzS3NtbnZKRTZRZ1hrSTA2SWhuMkxHY2ZzemJnLzNPMVhWYTZqSTBRNHhRYThlRGFxdDVkeU9pN24wWHJscXlxZ1l5SmozeGNhVzVrM1NWUUlEQVFBQm80SUNEakNDQWdvd0RnWURWUjBQQVFIL0JBUURBZ1hnTUhzR0ExVWRJQVIwTUhJd2NBWUpLd1lCQkFHQjdDMERNR013WVFZSUt3WUJCUVVIQWdFV1ZXaDBkSEE2THk5aFkzTmhkQzVwYlhCeVpXNXpZVzltYVdOcFlXd3VZMjl0TG1KeUwzSmxjRzl6YVhSdmNtbHZMMlJ3WXk5aFkzTmhkSE5sWm1GNmMzQXZaSEJqWDJGamMyRjBjMlZtWVhwemNDNXdaR1l3YXdZRFZSMGZCR1F3WWpCZ29GNmdYSVphYUhSMGNEb3ZMMkZqYzJGMExYUmxjM1JsTG1sdGNISmxibk5oYjJacFkybGhiQzVqYjIwdVluSXZjbVZ3YjNOcGRHOXlhVzh2YkdOeUwyRmpjMkYwYzJWbVlYcHpjQzloWTNOaGRITmxabUY2YzNCamNtd3VZM0pzTUlHbUJnZ3JCZ0VGQlFjQkFRU0JtVENCbGpBMEJnZ3JCZ0VGQlFjd0FZWW9hSFIwY0RvdkwyOWpjM0F0Y0dsc2IzUXVhVzF3Y21WdWMyRnZabWxqYVdGc0xtTnZiUzVpY2pCZUJnZ3JCZ0VGQlFjd0FvWlNhSFIwY0RvdkwyRmpjMkYwTFhSbGMzUmxMbWx0Y0hKbGJuTmhiMlpwWTJsaGJDNWpiMjB1WW5JdmNtVndiM05wZEc5eWFXOHZZMlZ5ZEdsbWFXTmhaRzl6TDJGamMyRjBMWFJsYzNSbExuQTNZekFUQmdOVkhTVUVEREFLQmdnckJnRUZCUWNEQWpBSkJnTlZIUk1FQWpBQU1DUUdBMVVkRVFRZE1CdWdHUVlGWUV3QkF3T2dFQVFPTURnM01qTXlNVGd3TURBeE9EWXdId1lEVlIwakJCZ3dGb0FVampsQkFGenl1QVhhcUcyWXVRRkdiVzVqM3dJd0RRWUpLb1pJaHZjTkFRRUxCUUFEZ2dJQkFGT1QwREJyYVIvQnpCME5uNU5IYWFqcE1hOHQySEZBcWtTZDNwZkxuM0tmMUZESkJxZmI0TmZLZkl6d3k0NFBlR3NsUkV3MTNoVDY4MzFiZGNRaWJ0dDdza3NoSjMvdTVMNTIxRFUzMGd5ZWxWQkxkT1YzbWRWZHNleU0wSnplcHBGOEI5ejd4UGFDS3hMTHdITHhZQnVhUURLTm1LYUNZMzNseTMrZ2ZQWTh3Y3Z2R1hZQURTNXgwK0dtOE0xZ01lT1VNSVpLZlVxMUdpdGw3bmZpOGxXdzBnbDYwKzUxaU44RnR5OXVwZHpTNU8zSVZPcmhLL3hHOWRGc3VOVGR2cHNjZ2VkWTBqbVlUekVaS3RIcmFqdmpMbkZIbWw4OHVzR1RRUHl2Tm5vZy8xZG10WTUxdFM0NW5ER3UzY2RtWGRXcko3cDA5OGh5aUpuMU5kREY4WUxFRTdnM3daQitidWlwNzMzTDdOZU9HYUgwd3V6MEZuRWRTQS9pTjhvZWVFV0M3QXNOdTEvL1lEUXE3b3JlK0F3bnZteXZSZnVSOWd4SjlUcUREbGpGaUlTNi9KYVJBMk52TWVIaVRncnQ1WDFWTlVvaUY5MUVIdVNkYmVrZXRIYkdqTTJSWDcvaFhFL3c2dnYvZTJxSWRJclk3bTZISFA5bkp5bHRJczV2a3ErN1RWOS83VnpwQkNhUENZNC9IS2czZDE4R0htdU85djlJOHFOa3lWQWFZTGxubkVVZVdoT3N6L3IyZUVKUklvSTVtaEw1cU82SzcwcXV5UVJTMW1UenlaSkc2bjkvTVh5a25Sak5Rb2Z0ZTJhbXVCOVRwL2tCVi8vQmJkYVJGR2tZSWRGNE1XRnBDVjB3WWcwMVF5ZHVNakVJRXIzSWRwRm1odFlVOGlCWjwvWDUwOUNlcnRpZmljYXRlPjwvWDUwOURhdGE+PC9LZXlJbmZvPjwvU2lnbmF0dXJlPjwvQ0ZlPg==|20180104095329|CFe35180108723218000186599000140520001873389448|4.40||qt9A072lqwFevWG/gqNdQmjgvzEvOpMxM3B7ZmvB63itjQ6lUrVfkObtKmGMLujK17Wo1aIKFS0prUKjt/Z4CZjZHTqmk79kM/QkuB1C4S2WZxY4OXXy+hliB5w8tZG1U/7We9L3+4hDMSTrpSaycds8qdgyJBHaozQWHU8KVRMEg6ozyRDN985edOnqGJRJHG2f2PSXQmzJYQzaIgUHYlwNBZhXATMzodicVH8+hQ6NvKNMnW1O09V71mke01+N4pKtJBz7YqtcgqajOa+ndn08nxhBeNlL8aFVTx0ILxM2S86CgcKvKAhLs1Kj/1d18ttljPZUnXkQ+7bEHDaHzA==";
			//CFEPDF cfepdf = new CFEPDF(xml, null);
			//cfepdf.gerarPdfAutorizacao();
			//String arquivo = cfepdf.getSaida();
			//imp.imprimir(arquivo);
			//Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + new File(arquivo));
			
			//CFEPDF cz = new CFEPDF();
			//cz.setRetornoSAT("000004|07000|0000|Cupom cancelado com sucesso + conteudo CF-E-SAT cancelado.|||PENGZUNhbmM+PGluZkNGZSBJZD0iQ0ZlMzUxODAxMDg3MjMyMTgwMDAxODY1OTkwMDAxNDA1MjAwMDIzOTY4MDk5NjUiIGNoQ2FuYz0iQ0ZlMzUxODAxMDg3MjMyMTgwMDAxODY1OTkwMDAxNDA1MjAwMDIzODUwNTg5MDQiIHZlcnNhbz0iMC4wNyI+PGRFbWk+MjAxODAxMTI8L2RFbWk+PGhFbWk+MTkyOTQ5PC9oRW1pPjxpZGU+PGNVRj4zNTwvY1VGPjxjTkY+NjgwOTk2PC9jTkY+PG1vZD41OTwvbW9kPjxuc2VyaWVTQVQ+OTAwMDE0MDUyPC9uc2VyaWVTQVQ+PG5DRmU+MDAwMjM5PC9uQ0ZlPjxkRW1pPjIwMTgwMTEyPC9kRW1pPjxoRW1pPjE5Mjk1OTwvaEVtaT48Y0RWPjU8L2NEVj48Q05QSj4xNjcxNjExNDAwMDE3MjwvQ05QSj48c2lnbkFDPlNHUi1TQVQgU0lTVEVNQSBERSBHRVNUQU8gRSBSRVRBR1VBUkRBIERPIFNBVDwvc2lnbkFDPjxhc3NpbmF0dXJhUVJDT0RFPlpIUXJxSm1ueXI4VWc3RldLZ0k3SVhzYzk4ZEljYVVJdnkyOWd0QllGaFhjdUs5WUIvMWF4NlRxdGFVNzduQTZ6Y3duTVBITlUvVEgvT3ZVeWVwSUlmTEQ3V1A3UjNIMWhGMHBiNi9VcDFlUVFUd0pIV1JlaEhSUU14RkRoWmFzT09QSlIrRXZPNTdCSG02RXpndURqc2RVWk1TU2VqSkpBU3pKdmNyZkV5bmdaRGNxTFI5RTJyeXh2T0J5OXVDMElSR1ZjYWl6WWM4RXFUNkd6ZWhSdG1jcndsZEI2V3M1UUFrdVlodEJkRnRWTTNyUFJxQTVOZmZ5OFdVNWRyTWphK3BnUm9QYzJOUnJRaFFRSHlKWkdkc09xcFQ1MlRTN2dlV0xOR0hOZjNHREJyWnVpN3UxUDhuT1RZVldwKzhHZXhCVEtLeHhWSTNFL1NwV1VqNUpZdz09PC9hc3NpbmF0dXJhUVJDT0RFPjxudW1lcm9DYWl4YT4wMDE8L251bWVyb0NhaXhhPjwvaWRlPjxlbWl0PjxDTlBKPjA4NzIzMjE4MDAwMTg2PC9DTlBKPjx4Tm9tZT5UQU5DQSBJTkZPUk1BVElDQSBFSVJFTEk8L3hOb21lPjx4RmFudD5UQU5DQTwveEZhbnQ+PGVuZGVyRW1pdD48eExncj5SVUEgTUFSRUNIQUwgRkxPUklBTk8gUEVJWE9UTzwveExncj48bnJvPjE2NjwvbnJvPjx4QmFpcnJvPlZJTEEgTUFSQ09OREVTPC94QmFpcnJvPjx4TXVuPlBSRVNJREVOVEUgUFJVREVOVEU8L3hNdW4+PENFUD4xOTAzMDAyMDwvQ0VQPjwvZW5kZXJFbWl0PjxJRT41NjIzNzcxMTExMTE8L0lFPjwvZW1pdD48ZGVzdD48L2Rlc3Q+PHRvdGFsPjx2Q0ZlPjM5Ljc0PC92Q0ZlPjwvdG90YWw+PGluZkFkaWM+PG9ic0Zpc2NvIHhDYW1wbz0iMTIzNDU2Nzg5MDEyMzQ1Njc4OTAiPjx4VGV4dG8+MTIzNDU2Nzg5MDEyMzQ1Njc4OTAxMjM0NTY3ODkwMTIzNDU2Nzg5MDEyMzQ1Njc4OTAxMjM0NTY3ODkwPC94VGV4dG8+PC9vYnNGaXNjbz48L2luZkFkaWM+PC9pbmZDRmU+PFNpZ25hdHVyZSB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC8wOS94bWxkc2lnIyI+PFNpZ25lZEluZm8+PENhbm9uaWNhbGl6YXRpb25NZXRob2QgQWxnb3JpdGhtPSJodHRwOi8vd3d3LnczLm9yZy9UUi8yMDAxL1JFQy14bWwtYzE0bi0yMDAxMDMxNSI+PC9DYW5vbmljYWxpemF0aW9uTWV0aG9kPjxTaWduYXR1cmVNZXRob2QgQWxnb3JpdGhtPSJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzA0L3htbGRzaWctbW9yZSNyc2Etc2hhMjU2Ij48L1NpZ25hdHVyZU1ldGhvZD48UmVmZXJlbmNlIFVSST0iI0NGZTM1MTgwMTA4NzIzMjE4MDAwMTg2NTk5MDAwMTQwNTIwMDAyMzk2ODA5OTY1Ij48VHJhbnNmb3Jtcz48VHJhbnNmb3JtIEFsZ29yaXRobT0iaHR0cDovL3d3dy53My5vcmcvMjAwMC8wOS94bWxkc2lnI2VudmVsb3BlZC1zaWduYXR1cmUiPjwvVHJhbnNmb3JtPjxUcmFuc2Zvcm0gQWxnb3JpdGhtPSJodHRwOi8vd3d3LnczLm9yZy9UUi8yMDAxL1JFQy14bWwtYzE0bi0yMDAxMDMxNSI+PC9UcmFuc2Zvcm0+PC9UcmFuc2Zvcm1zPjxEaWdlc3RNZXRob2QgQWxnb3JpdGhtPSJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzA0L3htbGVuYyNzaGEyNTYiPjwvRGlnZXN0TWV0aG9kPjxEaWdlc3RWYWx1ZT5HaG90cWI0S2p1UWZmTklZZHFwNS81RVNmR3lCNmVnblRWQVZFUTQ2bkxVPTwvRGlnZXN0VmFsdWU+PC9SZWZlcmVuY2U+PC9TaWduZWRJbmZvPjxTaWduYXR1cmVWYWx1ZT5ZeXhOVkRtakFzcmxvVzVHc0Ird3cxaVBHOVRXMFc2UnZ6dEZRQlN5aHMxZzkwam5ja01WVmhtU1hOV09pYWR5dmZpajFzWkwwNXVZMzZHTEVqUzN3VGVsc2hDZUZBdVRqSzdKMFgyUEFPdS9xQ3NSc0VKMzRqSXFFbndaN1dEV1E0MjVTb0kvdnp0WWFuL0E5N1p1YlA5WFJaQlRXd3RIMlM5a01RcEV6Y0xZbi9seW1hS3pUL0xHUHJCcjFUR0gyY0lWZEVpL2t6ZW5zdHJ0MVlQSnhuSlp3WWM4N1hVOFhQNS9MZk9jbDhmbDlGbnJ3R0V4UFpkcDhsTWRTYnpHbStzTXZZSmdPSVF2ZmFHUE9neXhLRVhENU5kbGFQV09jc3Z6VHNsV1RPQTc5a2hHcTlubFhuSXVoYWhaNXNXRzh4dW1UZVRnTWsvTU1oU0VNTEd2ZEE9PTwvU2lnbmF0dXJlVmFsdWU+PEtleUluZm8+PFg1MDlEYXRhPjxYNTA5Q2VydGlmaWNhdGU+TUlJR3NEQ0NCSmlnQXdJQkFnSUpBU0h4WmVWVHlKZ1ZNQTBHQ1NxR1NJYjNEUUVCQ3dVQU1HY3hDekFKQmdOVkJBWVRBa0pTTVRVd013WURWUVFLRXl4VFpXTnlaWFJoY21saElHUmhJRVpoZW1WdVpHRWdaRzhnUlhOMFlXUnZJR1JsSUZOaGJ5QlFZWFZzYnpFaE1COEdBMVVFQXhNWVFVTWdVMEZVSUdSbElGUmxjM1JsSUZORlJrRmFJRk5RTUI0WERURTNNVEV5TURFek1qWXpOVm9YRFRJeU1URXlNREV6TWpZek5Wb3dnYlV4RWpBUUJnTlZCQVVUQ1Rrd01EQXhOREExTWpFTE1Ba0dBMVVFQmhNQ1FsSXhFakFRQmdOVkJBZ1RDVk5CVHlCUVFWVk1UekVSTUE4R0ExVUVDaE1JVTBWR1FWb3RVMUF4RHpBTkJnTlZCQXNUQmtGRExWTkJWREVvTUNZR0ExVUVDeE1mUVhWMFpXNTBhV05oWkc4Z2NHOXlJRUZTSUZORlJrRmFJRk5RSUZOQlZERXdNQzRHQTFVRUF4TW5WRUZPUTBFZ1NVNUdUMUpOUVZSSlEwRWdSVWxTUlV4Sk9qQTROekl6TWpFNE1EQXdNVGcyTUlJQklqQU5CZ2txaGtpRzl3MEJBUUVGQUFPQ0FROEFNSUlCQ2dLQ0FRRUF2R213K2tKT3JQVU56QlUxQzVqKzU2OWJqUllucUFjcmExMllxeVFRSXlDNDBVNmFkeUdHNncya04yUTQwa0dHWDRjQ3hCeWlLMlF4OE04TWo3S1piTEtIRHorODhDRXZiZmNXNnJBM1VubEZBTndTekZ4WWd1TVRoaTNFMWZldHozZkh6ekUyUWZVdEw3bjRxWENpMWFZV1BFUGlyVk1jVWhtUlcydTNMVTZkaldSV0czSGRycm5IRHAvVXRBUUVPeTFIc3dFY2E5ckY2M2p4d2lLV0V5bm1SZlNpcUN2b0c5cmpoMjVodWR2RmkyZ0VpSDdBenhlNEpwVy8zYXJ2OEx2QXZIM0tzbW52SkU2UWdYa0kwNklobjJMR2Nmc3piZy8zTzFYVmE2akkwUTR4UWE4ZURhcXQ1ZHlPaTduMFhybHF5cWdZeUpqM3hjYVc1azNTVlFJREFRQUJvNElDRGpDQ0Fnb3dEZ1lEVlIwUEFRSC9CQVFEQWdYZ01Ic0dBMVVkSUFSME1ISXdjQVlKS3dZQkJBR0I3QzBETUdNd1lRWUlLd1lCQlFVSEFnRVdWV2gwZEhBNkx5OWhZM05oZEM1cGJYQnlaVzV6WVc5bWFXTnBZV3d1WTI5dExtSnlMM0psY0c5emFYUnZjbWx2TDJSd1l5OWhZM05oZEhObFptRjZjM0F2WkhCalgyRmpjMkYwYzJWbVlYcHpjQzV3WkdZd2F3WURWUjBmQkdRd1lqQmdvRjZnWElaYWFIUjBjRG92TDJGamMyRjBMWFJsYzNSbExtbHRjSEpsYm5OaGIyWnBZMmxoYkM1amIyMHVZbkl2Y21Wd2IzTnBkRzl5YVc4dmJHTnlMMkZqYzJGMGMyVm1ZWHB6Y0M5aFkzTmhkSE5sWm1GNmMzQmpjbXd1WTNKc01JR21CZ2dyQmdFRkJRY0JBUVNCbVRDQmxqQTBCZ2dyQmdFRkJRY3dBWVlvYUhSMGNEb3ZMMjlqYzNBdGNHbHNiM1F1YVcxd2NtVnVjMkZ2Wm1samFXRnNMbU52YlM1aWNqQmVCZ2dyQmdFRkJRY3dBb1pTYUhSMGNEb3ZMMkZqYzJGMExYUmxjM1JsTG1sdGNISmxibk5oYjJacFkybGhiQzVqYjIwdVluSXZjbVZ3YjNOcGRHOXlhVzh2WTJWeWRHbG1hV05oWkc5ekwyRmpjMkYwTFhSbGMzUmxMbkEzWXpBVEJnTlZIU1VFRERBS0JnZ3JCZ0VGQlFjREFqQUpCZ05WSFJNRUFqQUFNQ1FHQTFVZEVRUWRNQnVnR1FZRllFd0JBd09nRUFRT01EZzNNak15TVRnd01EQXhPRFl3SHdZRFZSMGpCQmd3Rm9BVWpqbEJBRnp5dUFYYXFHMll1UUZHYlc1ajN3SXdEUVlKS29aSWh2Y05BUUVMQlFBRGdnSUJBRk9UMERCcmFSL0J6QjBObjVOSGFhanBNYTh0MkhGQXFrU2QzcGZMbjNLZjFGREpCcWZiNE5mS2ZJend5NDRQZUdzbFJFdzEzaFQ2ODMxYmRjUWlidHQ3c2tzaEozL3U1TDUyMURVMzBneWVsVkJMZE9WM21kVmRzZXlNMEp6ZXBwRjhCOXo3eFBhQ0t4TEx3SEx4WUJ1YVFES05tS2FDWTMzbHkzK2dmUFk4d2N2dkdYWUFEUzV4MCtHbThNMWdNZU9VTUlaS2ZVcTFHaXRsN25maThsV3cwZ2w2MCs1MWlOOEZ0eTl1cGR6UzVPM0lWT3JoSy94RzlkRnN1TlRkdnBzY2dlZFkwam1ZVHpFWkt0SHJhanZqTG5GSG1sODh1c0dUUVB5dk5ub2cvMWRtdFk1MXRTNDVuREd1M2NkbVhkV3JKN3AwOThoeWlKbjFOZERGOFlMRUU3ZzN3WkIrYnVpcDczM0w3TmVPR2FIMHd1ejBGbkVkU0EvaU44b2VlRVdDN0FzTnUxLy9ZRFFxN29yZStBd252bXl2UmZ1UjlneEo5VHFERGxqRmlJUzYvSmFSQTJOdk1lSGlUZ3J0NVgxVk5Vb2lGOTFFSHVTZGJla2V0SGJHak0yUlg3L2hYRS93NnZ2L2UycUlkSXJZN202SEhQOW5KeWx0SXM1dmtxKzdUVjkvN1Z6cEJDYVBDWTQvSEtnM2QxOEdIbXVPOXY5SThxTmt5VkFhWUxsbm5FVWVXaE9zei9yMmVFSlJJb0k1bWhMNXFPNks3MHF1eVFSUzFtVHp5WkpHNm45L01YeWtuUmpOUW9mdGUyYW11QjlUcC9rQlYvL0JiZGFSRkdrWUlkRjRNV0ZwQ1Ywd1lnMDFReWR1TWpFSUVyM0lkcEZtaHRZVThpQlo8L1g1MDlDZXJ0aWZpY2F0ZT48L1g1MDlEYXRhPjwvS2V5SW5mbz48L1NpZ25hdHVyZT48L0NGZUNhbmM+|20180112192959|CFe35180108723218000186599000140520002396809965|39.74||ZHQrqJmnyr8Ug7FWKgI7IXsc98dIcaUIvy29gtBYFhXcuK9YB/1ax6TqtaU77nA6zcwnMPHNU/TH/OvUyepIIfLD7WP7R3H1hF0pb6/Up1eQQTwJHWRehHRQMxFDhZasOOPJR+EvO57BHm6EzguDjsdUZMSSejJJASzJvcrfEyngZDcqLR9E2ryxvOBy9uC0IRGVcaizYc8EqT6GzehRtmcrwldB6Ws5QAkuYhtBdFtVM3rPRqA5Nffy8WU5drMja+pgRoPc2NRrQhQQHyJZGdsOqpT52TS7geWLNGHNf3GDBrZui7u1P8nOTYVWp+8GexBTKKxxVI3E/SpWUj5JYw==");
			//cz.gerarPdfCancelamento();
			//String arquivoz = cz.getSaida();
			//imp.imprimir(arquivoz);
			//Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + new File(arquivo));
			
			//String xml3 = "000004|07000|0000|Cupom cancelado com sucesso + conteudo CF-E-SAT cancelado.|||PENGZUNhbmM+PGluZkNGZSBJZD0iQ0ZlMzUxODAxMDg3MjMyMTgwMDAxODY1OTkwMDAxNDA1MjAwMDIzOTY4MDk5NjUiIGNoQ2FuYz0iQ0ZlMzUxODAxMDg3MjMyMTgwMDAxODY1OTkwMDAxNDA1MjAwMDIzODUwNTg5MDQiIHZlcnNhbz0iMC4wNyI+PGRFbWk+MjAxODAxMTI8L2RFbWk+PGhFbWk+MTkyOTQ5PC9oRW1pPjxpZGU+PGNVRj4zNTwvY1VGPjxjTkY+NjgwOTk2PC9jTkY+PG1vZD41OTwvbW9kPjxuc2VyaWVTQVQ+OTAwMDE0MDUyPC9uc2VyaWVTQVQ+PG5DRmU+MDAwMjM5PC9uQ0ZlPjxkRW1pPjIwMTgwMTEyPC9kRW1pPjxoRW1pPjE5Mjk1OTwvaEVtaT48Y0RWPjU8L2NEVj48Q05QSj4xNjcxNjExNDAwMDE3MjwvQ05QSj48c2lnbkFDPlNHUi1TQVQgU0lTVEVNQSBERSBHRVNUQU8gRSBSRVRBR1VBUkRBIERPIFNBVDwvc2lnbkFDPjxhc3NpbmF0dXJhUVJDT0RFPlpIUXJxSm1ueXI4VWc3RldLZ0k3SVhzYzk4ZEljYVVJdnkyOWd0QllGaFhjdUs5WUIvMWF4NlRxdGFVNzduQTZ6Y3duTVBITlUvVEgvT3ZVeWVwSUlmTEQ3V1A3UjNIMWhGMHBiNi9VcDFlUVFUd0pIV1JlaEhSUU14RkRoWmFzT09QSlIrRXZPNTdCSG02RXpndURqc2RVWk1TU2VqSkpBU3pKdmNyZkV5bmdaRGNxTFI5RTJyeXh2T0J5OXVDMElSR1ZjYWl6WWM4RXFUNkd6ZWhSdG1jcndsZEI2V3M1UUFrdVlodEJkRnRWTTNyUFJxQTVOZmZ5OFdVNWRyTWphK3BnUm9QYzJOUnJRaFFRSHlKWkdkc09xcFQ1MlRTN2dlV0xOR0hOZjNHREJyWnVpN3UxUDhuT1RZVldwKzhHZXhCVEtLeHhWSTNFL1NwV1VqNUpZdz09PC9hc3NpbmF0dXJhUVJDT0RFPjxudW1lcm9DYWl4YT4wMDE8L251bWVyb0NhaXhhPjwvaWRlPjxlbWl0PjxDTlBKPjA4NzIzMjE4MDAwMTg2PC9DTlBKPjx4Tm9tZT5UQU5DQSBJTkZPUk1BVElDQSBFSVJFTEk8L3hOb21lPjx4RmFudD5UQU5DQTwveEZhbnQ+PGVuZGVyRW1pdD48eExncj5SVUEgTUFSRUNIQUwgRkxPUklBTk8gUEVJWE9UTzwveExncj48bnJvPjE2NjwvbnJvPjx4QmFpcnJvPlZJTEEgTUFSQ09OREVTPC94QmFpcnJvPjx4TXVuPlBSRVNJREVOVEUgUFJVREVOVEU8L3hNdW4+PENFUD4xOTAzMDAyMDwvQ0VQPjwvZW5kZXJFbWl0PjxJRT41NjIzNzcxMTExMTE8L0lFPjwvZW1pdD48ZGVzdD48L2Rlc3Q+PHRvdGFsPjx2Q0ZlPjM5Ljc0PC92Q0ZlPjwvdG90YWw+PGluZkFkaWM+PG9ic0Zpc2NvIHhDYW1wbz0iMTIzNDU2Nzg5MDEyMzQ1Njc4OTAiPjx4VGV4dG8+MTIzNDU2Nzg5MDEyMzQ1Njc4OTAxMjM0NTY3ODkwMTIzNDU2Nzg5MDEyMzQ1Njc4OTAxMjM0NTY3ODkwPC94VGV4dG8+PC9vYnNGaXNjbz48L2luZkFkaWM+PC9pbmZDRmU+PFNpZ25hdHVyZSB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC8wOS94bWxkc2lnIyI+PFNpZ25lZEluZm8+PENhbm9uaWNhbGl6YXRpb25NZXRob2QgQWxnb3JpdGhtPSJodHRwOi8vd3d3LnczLm9yZy9UUi8yMDAxL1JFQy14bWwtYzE0bi0yMDAxMDMxNSI+PC9DYW5vbmljYWxpemF0aW9uTWV0aG9kPjxTaWduYXR1cmVNZXRob2QgQWxnb3JpdGhtPSJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzA0L3htbGRzaWctbW9yZSNyc2Etc2hhMjU2Ij48L1NpZ25hdHVyZU1ldGhvZD48UmVmZXJlbmNlIFVSST0iI0NGZTM1MTgwMTA4NzIzMjE4MDAwMTg2NTk5MDAwMTQwNTIwMDAyMzk2ODA5OTY1Ij48VHJhbnNmb3Jtcz48VHJhbnNmb3JtIEFsZ29yaXRobT0iaHR0cDovL3d3dy53My5vcmcvMjAwMC8wOS94bWxkc2lnI2VudmVsb3BlZC1zaWduYXR1cmUiPjwvVHJhbnNmb3JtPjxUcmFuc2Zvcm0gQWxnb3JpdGhtPSJodHRwOi8vd3d3LnczLm9yZy9UUi8yMDAxL1JFQy14bWwtYzE0bi0yMDAxMDMxNSI+PC9UcmFuc2Zvcm0+PC9UcmFuc2Zvcm1zPjxEaWdlc3RNZXRob2QgQWxnb3JpdGhtPSJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzA0L3htbGVuYyNzaGEyNTYiPjwvRGlnZXN0TWV0aG9kPjxEaWdlc3RWYWx1ZT5HaG90cWI0S2p1UWZmTklZZHFwNS81RVNmR3lCNmVnblRWQVZFUTQ2bkxVPTwvRGlnZXN0VmFsdWU+PC9SZWZlcmVuY2U+PC9TaWduZWRJbmZvPjxTaWduYXR1cmVWYWx1ZT5ZeXhOVkRtakFzcmxvVzVHc0Ird3cxaVBHOVRXMFc2UnZ6dEZRQlN5aHMxZzkwam5ja01WVmhtU1hOV09pYWR5dmZpajFzWkwwNXVZMzZHTEVqUzN3VGVsc2hDZUZBdVRqSzdKMFgyUEFPdS9xQ3NSc0VKMzRqSXFFbndaN1dEV1E0MjVTb0kvdnp0WWFuL0E5N1p1YlA5WFJaQlRXd3RIMlM5a01RcEV6Y0xZbi9seW1hS3pUL0xHUHJCcjFUR0gyY0lWZEVpL2t6ZW5zdHJ0MVlQSnhuSlp3WWM4N1hVOFhQNS9MZk9jbDhmbDlGbnJ3R0V4UFpkcDhsTWRTYnpHbStzTXZZSmdPSVF2ZmFHUE9neXhLRVhENU5kbGFQV09jc3Z6VHNsV1RPQTc5a2hHcTlubFhuSXVoYWhaNXNXRzh4dW1UZVRnTWsvTU1oU0VNTEd2ZEE9PTwvU2lnbmF0dXJlVmFsdWU+PEtleUluZm8+PFg1MDlEYXRhPjxYNTA5Q2VydGlmaWNhdGU+TUlJR3NEQ0NCSmlnQXdJQkFnSUpBU0h4WmVWVHlKZ1ZNQTBHQ1NxR1NJYjNEUUVCQ3dVQU1HY3hDekFKQmdOVkJBWVRBa0pTTVRVd013WURWUVFLRXl4VFpXTnlaWFJoY21saElHUmhJRVpoZW1WdVpHRWdaRzhnUlhOMFlXUnZJR1JsSUZOaGJ5QlFZWFZzYnpFaE1COEdBMVVFQXhNWVFVTWdVMEZVSUdSbElGUmxjM1JsSUZORlJrRmFJRk5RTUI0WERURTNNVEV5TURFek1qWXpOVm9YRFRJeU1URXlNREV6TWpZek5Wb3dnYlV4RWpBUUJnTlZCQVVUQ1Rrd01EQXhOREExTWpFTE1Ba0dBMVVFQmhNQ1FsSXhFakFRQmdOVkJBZ1RDVk5CVHlCUVFWVk1UekVSTUE4R0ExVUVDaE1JVTBWR1FWb3RVMUF4RHpBTkJnTlZCQXNUQmtGRExWTkJWREVvTUNZR0ExVUVDeE1mUVhWMFpXNTBhV05oWkc4Z2NHOXlJRUZTSUZORlJrRmFJRk5RSUZOQlZERXdNQzRHQTFVRUF4TW5WRUZPUTBFZ1NVNUdUMUpOUVZSSlEwRWdSVWxTUlV4Sk9qQTROekl6TWpFNE1EQXdNVGcyTUlJQklqQU5CZ2txaGtpRzl3MEJBUUVGQUFPQ0FROEFNSUlCQ2dLQ0FRRUF2R213K2tKT3JQVU56QlUxQzVqKzU2OWJqUllucUFjcmExMllxeVFRSXlDNDBVNmFkeUdHNncya04yUTQwa0dHWDRjQ3hCeWlLMlF4OE04TWo3S1piTEtIRHorODhDRXZiZmNXNnJBM1VubEZBTndTekZ4WWd1TVRoaTNFMWZldHozZkh6ekUyUWZVdEw3bjRxWENpMWFZV1BFUGlyVk1jVWhtUlcydTNMVTZkaldSV0czSGRycm5IRHAvVXRBUUVPeTFIc3dFY2E5ckY2M2p4d2lLV0V5bm1SZlNpcUN2b0c5cmpoMjVodWR2RmkyZ0VpSDdBenhlNEpwVy8zYXJ2OEx2QXZIM0tzbW52SkU2UWdYa0kwNklobjJMR2Nmc3piZy8zTzFYVmE2akkwUTR4UWE4ZURhcXQ1ZHlPaTduMFhybHF5cWdZeUpqM3hjYVc1azNTVlFJREFRQUJvNElDRGpDQ0Fnb3dEZ1lEVlIwUEFRSC9CQVFEQWdYZ01Ic0dBMVVkSUFSME1ISXdjQVlKS3dZQkJBR0I3QzBETUdNd1lRWUlLd1lCQlFVSEFnRVdWV2gwZEhBNkx5OWhZM05oZEM1cGJYQnlaVzV6WVc5bWFXTnBZV3d1WTI5dExtSnlMM0psY0c5emFYUnZjbWx2TDJSd1l5OWhZM05oZEhObFptRjZjM0F2WkhCalgyRmpjMkYwYzJWbVlYcHpjQzV3WkdZd2F3WURWUjBmQkdRd1lqQmdvRjZnWElaYWFIUjBjRG92TDJGamMyRjBMWFJsYzNSbExtbHRjSEpsYm5OaGIyWnBZMmxoYkM1amIyMHVZbkl2Y21Wd2IzTnBkRzl5YVc4dmJHTnlMMkZqYzJGMGMyVm1ZWHB6Y0M5aFkzTmhkSE5sWm1GNmMzQmpjbXd1WTNKc01JR21CZ2dyQmdFRkJRY0JBUVNCbVRDQmxqQTBCZ2dyQmdFRkJRY3dBWVlvYUhSMGNEb3ZMMjlqYzNBdGNHbHNiM1F1YVcxd2NtVnVjMkZ2Wm1samFXRnNMbU52YlM1aWNqQmVCZ2dyQmdFRkJRY3dBb1pTYUhSMGNEb3ZMMkZqYzJGMExYUmxjM1JsTG1sdGNISmxibk5oYjJacFkybGhiQzVqYjIwdVluSXZjbVZ3YjNOcGRHOXlhVzh2WTJWeWRHbG1hV05oWkc5ekwyRmpjMkYwTFhSbGMzUmxMbkEzWXpBVEJnTlZIU1VFRERBS0JnZ3JCZ0VGQlFjREFqQUpCZ05WSFJNRUFqQUFNQ1FHQTFVZEVRUWRNQnVnR1FZRllFd0JBd09nRUFRT01EZzNNak15TVRnd01EQXhPRFl3SHdZRFZSMGpCQmd3Rm9BVWpqbEJBRnp5dUFYYXFHMll1UUZHYlc1ajN3SXdEUVlKS29aSWh2Y05BUUVMQlFBRGdnSUJBRk9UMERCcmFSL0J6QjBObjVOSGFhanBNYTh0MkhGQXFrU2QzcGZMbjNLZjFGREpCcWZiNE5mS2ZJend5NDRQZUdzbFJFdzEzaFQ2ODMxYmRjUWlidHQ3c2tzaEozL3U1TDUyMURVMzBneWVsVkJMZE9WM21kVmRzZXlNMEp6ZXBwRjhCOXo3eFBhQ0t4TEx3SEx4WUJ1YVFES05tS2FDWTMzbHkzK2dmUFk4d2N2dkdYWUFEUzV4MCtHbThNMWdNZU9VTUlaS2ZVcTFHaXRsN25maThsV3cwZ2w2MCs1MWlOOEZ0eTl1cGR6UzVPM0lWT3JoSy94RzlkRnN1TlRkdnBzY2dlZFkwam1ZVHpFWkt0SHJhanZqTG5GSG1sODh1c0dUUVB5dk5ub2cvMWRtdFk1MXRTNDVuREd1M2NkbVhkV3JKN3AwOThoeWlKbjFOZERGOFlMRUU3ZzN3WkIrYnVpcDczM0w3TmVPR2FIMHd1ejBGbkVkU0EvaU44b2VlRVdDN0FzTnUxLy9ZRFFxN29yZStBd252bXl2UmZ1UjlneEo5VHFERGxqRmlJUzYvSmFSQTJOdk1lSGlUZ3J0NVgxVk5Vb2lGOTFFSHVTZGJla2V0SGJHak0yUlg3L2hYRS93NnZ2L2UycUlkSXJZN202SEhQOW5KeWx0SXM1dmtxKzdUVjkvN1Z6cEJDYVBDWTQvSEtnM2QxOEdIbXVPOXY5SThxTmt5VkFhWUxsbm5FVWVXaE9zei9yMmVFSlJJb0k1bWhMNXFPNks3MHF1eVFSUzFtVHp5WkpHNm45L01YeWtuUmpOUW9mdGUyYW11QjlUcC9rQlYvL0JiZGFSRkdrWUlkRjRNV0ZwQ1Ywd1lnMDFReWR1TWpFSUVyM0lkcEZtaHRZVThpQlo8L1g1MDlDZXJ0aWZpY2F0ZT48L1g1MDlEYXRhPjwvS2V5SW5mbz48L1NpZ25hdHVyZT48L0NGZUNhbmM+|20180112192959|CFe35180108723218000186599000140520002396809965|39.74||ZHQrqJmnyr8Ug7FWKgI7IXsc98dIcaUIvy29gtBYFhXcuK9YB/1ax6TqtaU77nA6zcwnMPHNU/TH/OvUyepIIfLD7WP7R3H1hF0pb6/Up1eQQTwJHWRehHRQMxFDhZasOOPJR+EvO57BHm6EzguDjsdUZMSSejJJASzJvcrfEyngZDcqLR9E2ryxvOBy9uC0IRGVcaizYc8EqT6GzehRtmcrwldB6Ws5QAkuYhtBdFtVM3rPRqA5Nffy8WU5drMja+pgRoPc2NRrQhQQHyJZGdsOqpT52TS7geWLNGHNf3GDBrZui7u1P8nOTYVWp+8GexBTKKxxVI3E/SpWUj5JYw==";
			//CFEPDF cfepdf3 = new CFEPDF(xml3, null);
			//cfepdf3.gerarPdfCancelamento();
			//String arquivo3 = cfepdf3.getSaida();
			//imp.imprimir(arquivo3);
			//Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + new File(arquivo3));
			
			//imp.imprimirAvulso("All the jars listed above are available under the AGPL license. Additional iText 7 functionality is available through add-ons<br/>", null);
			//imp.imprimirAvulso("All the jars listed above are available under the AGPL license. Additional iText 7 functionality is available through add-ons<br/>", null);			
			//imp.imprimirAvulso("All the jars listed above are available under the AGPL license. Additional iText 7 functionality is available through add-ons<br/>", null);			
			//imp.imprimirAvulso("All the jars listed above are available under the AGPL license. Additional iText 7 functionality is available through add-ons<br/>", null);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

<h1>Втора лабораториска вежба по Софтверско инженерство</h1>

<h2>Борис Џотов, бр. на индекс 185022</h2>

<h3>Група на код:</h3>
<p>Ја добив групата на код 3</p>

<h3>Control Flow Graph</h3>
![](si_lab2.png)

<h3>Цикломатска комплексност</h3>
Цикломатската комплексност на овој код е 6, истата ја добив преку формулата P+1, каде што Р е бројот на предикатни јазли.
Во случајов Р=5, па цикломатската комплексност изнесува 5+1=6.

<h3>Тест случаи според критериумот Multiple condition</h3>
<p>Multiple condition nodes: <strong>D & R</strong></p>
<table style="border-width: 1px; text-align: center">

<tr>
<td>Node</td>
<td>True</td>
<td>False</td>
</tr>

<tr>
<td><strong>D</strong></td>
<td>T || T; T || F; F || T</td>
<td>F || F</td>
</tr>

<tr>
<td><strong>R</strong></td>
<td>F || F || T; F || T || F; F || T || T; T || F || F; T || F || T; T || T || F; T || T || T; </td>
<td>F || F || F </td>
</tr>
</table>

<h3>Тест случаи според критериумот Every statement</h3>
<p>Every statement nodes: <strong>B, D, H, J, R</strong></p>
<table style="border-width: 1px">

<tr>
<td>Node</td>
<td>True</td>
<td>False</td>
</tr>

<tr>
<td><strong>B</strong></td>
<td>user==null</td>
<td>user!=null</td>
</tr>

<tr>
<td><strong>D</strong></td>
<td>T || T; T || F; F || T</td>
<td>F || F</td>
</tr>

<tr>
<td><strong>H</strong></td>
<td>pasword.contains(user.getUsername().toLowerCase)))=T</td>
<td>pasword.contains(user.getUsername().toLowerCase)))=F</td>
</tr>

<tr>
<td><strong>J</strong></td>
<td>passwordLower.length()<8</td>
<td>passwordLower.length()>8</td>
</tr>

<tr>
<td><strong>R</strong></td>
<td>F || F || T; F || T || F; F || T || T; T || F || F; T || F || T; T || T || F; T || T || T; </td>
<td>F || F || F </td>
</tr>

</table>

<h3>Објаснување на напишаните unit tests</h3>
package com.hanbit.web.grade;

import java.io.Serializable;

public class GradeBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String id,seq,grade,examDate,subject,major;
	private int java, sql, html,javascript,score;
	
	public GradeBean() {
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public GradeBean(String seq, String grade,int java,int sql, int html,int javascript, String id, String examDate){
		this.seq = seq;
		this.grade = grade;
		this.java = java;
		this.sql = sql;
		this.html = html;
		this.javascript = javascript;
		this.id = id;
		this.examDate = examDate;
		
	}
	public String getExamDate() {
		return examDate;
	}
	public void setExamDate(String examDate) {
		this.examDate = examDate;
	}
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getSql() {
		return sql;
	}
	public void setSql(int sql) {
		this.sql = sql;
	}
	public int getHtml() {
		return html;
	}
	public void setHtml(int html) {
		this.html = html;
	}
	public int getJavascript() {
		return javascript;
	}
	public void setJavascript(int javascript) {
		this.javascript = javascript;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGrade() {
		
		int avg= (java+sql+html+javascript)/4;
		
		switch (avg/10) {
		case 9:
			grade = "A";
		    break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
				default:
			grade = "F";
			break;
		}
		
		
		
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "성적표 [No."+ seq +", ID=" + id + " , 학점=" + grade + "\n 자바=" + java + ", SQL=" + sql + ", HTML5=" + html
				+ ", 자바스크립트=" + javascript + "]";
	}
	

}

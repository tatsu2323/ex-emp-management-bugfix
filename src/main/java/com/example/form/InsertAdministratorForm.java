package com.example.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 * 管理者情報登録時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class InsertAdministratorForm {
	/** 名前 */
	@NotBlank(message = "名前は必須です")
	private String name;
	/** メールアドレス */
	@NotBlank (message = "メールアドレスは入力してください")
	@Email (message = "Email形式で入力してください")
	private String mailAddress;
	/** パスワード */
	@Size(min=8,max=16, message="パスワードは8文字以上16文字以下で入力してください")
	private String password;

	/**確認用パスワード */
	@Size(min=8,max=16, message="パスワードは8文字以上16文字以下で入力してください")
	private String passwordConfirmation;

	// /** 相関チェック */
	// @AssertTrue(message ="passwordと確認用パスワードは同一にしてください。")
	// private boolean isPasswordValid() {
	// 	if( password == null || password.isEmpty()) {
	// 		return true;
	// 	}
	// 	return password.equals(passwordConfirmation);
	// }

	public InsertAdministratorForm() {
	}

	public InsertAdministratorForm(String name,
			@NotBlank(message = "メールアドレスは入力してください") @Email(message = "Email形式で入力してください") String mailAddress,
			@Size(min = 8, max = 16, message = "パスワードは8文字以上16文字以下で入力してください") String password,
			@Size(min = 8, max = 16, message = "パスワードは8文字以上16文字以下で入力してください") String passwordConfirmation) {
		this.name = name;
		this.mailAddress = mailAddress;
		this.password = password;
		this.passwordConfirmation = passwordConfirmation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}

	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
	}

	@Override
	public String toString() {
		return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
				+ ", passwordConfirmation=" + passwordConfirmation + "]";
	}
}


public class Annotations {
	private int experimentID;
	private String pubmedId;
	private String type;
	private String specie;
	private String genoRelease;
	private boolean cellLine;
	private String devStage;
	private String sex;
	private String tissue;

	public Annotations() {

	}

	public int getExperimentID() {
		return experimentID;
	}

	public void setExperimentID(int experimentID) {
		this.experimentID = experimentID;
	}

	public String getPubmedId() {
		return pubmedId;
	}

	public void setPubmedId(String pubmedId) {
		this.pubmedId = pubmedId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSpecie() {
		return specie;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	}

	public String getGenoRelease() {
		return genoRelease;
	}

	public void setGenoRelease(String genoRelease) {
		this.genoRelease = genoRelease;
	}

	public boolean isCellLine() {
		return cellLine;
	}

	public void setCellLine(boolean cellLine) {
		this.cellLine = cellLine;
	}

	public String getDevStage() {
		return devStage;
	}

	public void setDevStage(String devStage) {
		this.devStage = devStage;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTissue() {
		return tissue;
	}

	public void setTissue(String tissue) {
		this.tissue = tissue;
	}

}

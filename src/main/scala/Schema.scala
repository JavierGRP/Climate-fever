case class Schema() {
  // Create case classes for climate-fever.json schemas
  case class Claims(
     animal_claims: List[ClaimProperties],
     nature_claims: List[ClaimProperties],
     human_claims: List[ClaimProperties]
  )

  case class ClaimProperties(
    claim_id: String,
    claim: String,
    claim_label: String,
    evidences: List[Evidences]
  )

  case class Evidences(
    evidence_id: String,
    evidence_label: String,
    article: String,
    evidence: String,
    entropy: Int,
    votes: List[String]
  )
}


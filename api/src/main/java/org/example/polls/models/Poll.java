package org.example.polls.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.example.entities.SpecificUserRestriction;
import org.example.entities.UserRestriction;
import org.example.users.models.User;
import org.hibernate.annotations.UuidGenerator;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Polls")
public class Poll {

  @Id
  @GeneratedValue
  @UuidGenerator
  private UUID pollId;
  @ManyToOne
  @JoinColumn(name = "pollCreator")
  private User pollCreator;
  private String title;
  private String description;
  private java.sql.Timestamp voteStart;
  private java.sql.Timestamp voteEnd;
  private java.sql.Timestamp nominationEndTime;
  private java.sql.Timestamp pollCreationTime;

  @OneToMany(mappedBy = "poll")
  @JsonManagedReference
  private List<UserRestriction> userRestrictions;
  @OneToMany(mappedBy = "poll")
  @JsonManagedReference
  private List<SpecificUserRestriction> specificUserRestrictions;


  public UUID getPollId() {
    return pollId;
  }

  public void setPollId(UUID pollId) {
    this.pollId = pollId;
  }


  public User getPollCreator() {
    return pollCreator;
  }

  public void setPollCreator(User pollCreator) {
    this.pollCreator = pollCreator;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public java.sql.Timestamp getVoteStart() {
    return voteStart;
  }

  public void setVoteStart(java.sql.Timestamp voteStart) {
    this.voteStart = voteStart;
  }


  public java.sql.Timestamp getVoteEnd() {
    return voteEnd;
  }

  public void setVoteEnd(java.sql.Timestamp voteEnd) {
    this.voteEnd = voteEnd;
  }


  public java.sql.Timestamp getNominationEndTime() {
    return nominationEndTime;
  }

  public void setNominationEndTime(java.sql.Timestamp nominationEndTime) {
    this.nominationEndTime = nominationEndTime;
  }


  public java.sql.Timestamp getPollCreationTime() {
    return pollCreationTime;
  }

  public void setPollCreationTime(java.sql.Timestamp pollCreationTime) {
    this.pollCreationTime = pollCreationTime;
  }

  public List<UserRestriction> getUserRestrictions() {
    return userRestrictions;
  }

  public void setUserRestrictions(List<UserRestriction> userRestrictions) {
    this.userRestrictions = userRestrictions;
  }

  public List<SpecificUserRestriction> getSpecificUserRestrictions() {
    return specificUserRestrictions;
  }

  public void setSpecificUserRestrictions(List<SpecificUserRestriction> specificUserRestrictions) {
    this.specificUserRestrictions = specificUserRestrictions;
  }
}

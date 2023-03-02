import {UserVote} from "./userVote";

export interface Nomination{
  id: number;
  nominee: string;
  votes: UserVote[];
}

package sbu.cs.exception;
import java.util.List;

public class Reader extends Util {


  /**
   * declare 2 Exception class. 1 for UnrecognizedCommand and 1 for NotImplementedCommand
   * iterate on function inputs and check for commands and throw exception when needed.
   *
   * @param args
   */
  public void readTwitterCommands(List<String> args) throws ApException {
    {
      boolean implementedCommand = true;
      for (String s : args) {
        if (getNotImplementedCommands().contains(s)) {
          throw new NotImplementedCommandException();
        }
      }
      for (String arg : args) {
        if (!getImplementedCommands().contains(arg)) {
          implementedCommand = false;
          break;
        }
      }
      if (!implementedCommand) {
        throw new UnrecognizedCommandException();
      }
    }
  }

  /**
   * function inputs are String but odd positions must be integer parsable
   * a valid input is like -> "ap", "2", "beheshti", "3992", "20"
   * throw BadInput exception when the string is not parsable.
   *
   * @param args
   */
  public void read(String... args) throws BadInputException {
    int n = args.length;
    for (int i = 0; i < n; i++) {
      if (i % 2 == 1) {
        try{
          Integer.parseInt(args[i]);
        }
        catch (NumberFormatException ex){
          throw new BadInputException();
        }
      }


    }
  }
}


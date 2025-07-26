def find_frequency(s,ch):
    return s.count(ch)
def replace_char(s,old,new):
    return s.replace(old,new)
def remove_first_occurrence(s,ch)
    return s.replace(ch,'',1)
def remove_all_occurrences(s,ch):
    return s.replace(ch,'')

def menu():
    print("\nMenu:")
    print("a)Find frequency of character in a string")
    print("b)Replacea character by another character in a string")
    print("c)Remove the first occurrence of a character from string")
    print("d)Remove the all occurrence of a character from a strinf")
    print("e)Exit")

def main():
    s=input("Enter a string:")

  while True:
      menu()
      choice=input("Enter your choice (a/b/c/d/e):").lower()

       if choice=='a':
           ch=input("Enter the character tofind frequency:")
           freq=find_frequency(s,ch)
           print(f"Frequency of'{ch}'in the string is:{freq}")

     elif choice=='b':
         old=input 
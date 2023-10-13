#include <iostream>
#include <cstring>
using namespace std;

class cwh
{
protected:
    string title;
    float rating;

public:
    cwh(string s, float r)
    {
        title = s;
        rating = r;
    }

    virtual void display() = 0; // if assign this 0 then it will be a do nothing function which is commonly known as pure virutal function and by doing this it will be neccesary to make a display function in all derived function
};

class cwhvideo : public cwh
{
    float videolength;

public:
    cwhvideo(string s, float r, float vi) : cwh(s, r)
    {
        videolength = vi;
    }

    void display() // putting virtual here will not work because base class function is already called
    {
        cout << "This is an amazing video with title " << title << endl;
        cout << "RATING: " << rating << " out of 5 stars" << endl;
        cout << "The length of this video is " << videolength << " minutes" << endl;
    }
};

class cwhtext : public cwh
{
    int wordcount;

public:
    cwhtext(string s, float r, int wc) : cwh(s, r)
    {
        wordcount = wc;
    }

    void display()
    {
        cout << "This is an amazing text with title " << title << endl;
        cout << "RATING: " << rating << " out of 5 stars" << endl;
        cout << "total words in this text is " << wordcount << " words" << endl;
    }
};

int main()
{
    string title;
    float rating, vlen;
    int words;

    // used for harry's video
    title = "django tutorial";

    vlen = 4.56;
    rating = 4.8;
    cwhvideo djvideo(title, rating, vlen);
    // djvideo.display();

    // used for text
    title = "django tutorial text";

    words = 400;
    rating = 4.3;
    cwhtext djtext(title, rating, words);
    // djtext.display();

    // Now making two pointers of cwh one for cwhvideo and one for cwh text
    cwh *tuts[2];
    tuts[0] = &djvideo;
    tuts[1] = &djtext;

    tuts[0]->display();
    tuts[1]->display();

    return 0;
}


/*
Abstract base class is a class which is only used to create more classes from it and not objects and pure virtual function and abstract base class are inter-related


And there must be atleast one pure virtual function in a abstract base class
*/
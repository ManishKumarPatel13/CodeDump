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

    virtual void display()
    { // if we remove virtual from this then this display will be called because we have made a base class pointer and by using virtual derived class functions will be called
        cout << "Base class display is called" << endl;
    }
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
Rules for creating virtual functions

1.They cannot be static
2.They are accessed by object pointers
3.Virtual functions can be a friend of another class
4.A virtual function in the base class might not be used.
5.If a virtual function is defined in a base class, there is no necessity of redefining it in the derived class

*/
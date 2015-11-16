// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gni
{

    int a;
    String b;
    long c;
    String d;
    String e;

    gni()
    {
    }

    void a(int i, int j, long l, String s, String s1)
    {
        a = i;
        c = l;
        d = s;
        e = s1;
        switch (j)
        {
        default:
            b = "?";
            return;

        case 3: // '\003'
            b = "D";
            return;

        case 5: // '\005'
            b = "W";
            return;

        case 4: // '\004'
            b = "I";
            return;

        case 2: // '\002'
            b = "V";
            return;

        case 6: // '\006'
            b = "E";
            return;

        case 7: // '\007'
            b = "A";
            break;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public class asy
{

    public String a;
    public String b;
    public asz c;
    public String d;

    public asy()
    {
    }

    protected void a(Parcel parcel)
    {
        parcel.writeInt(c.ordinal());
        parcel.writeString(b);
        parcel.writeString(a);
        parcel.writeString(d);
    }

    protected void b(Parcel parcel)
    {
        int i = parcel.readInt();
        c = asz.values()[i];
        b = parcel.readString();
        a = parcel.readString();
        d = parcel.readString();
    }

    public String toString()
    {
        String s = String.valueOf(c);
        String s1 = b;
        String s2 = d;
        String s3 = a;
        return (new StringBuilder(String.valueOf(s).length() + 47 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append("attachmentType: ").append(s).append(" id: ").append(s1).append(" contentType: ").append(s2).append(" uriToSend: ").append(s3).toString();
    }
}

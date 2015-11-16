// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class duf
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new dug();
    public String a;
    public String b;
    public int c;
    public int d;

    public duf()
    {
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeInt(c);
        parcel.writeInt(d);
    }

}

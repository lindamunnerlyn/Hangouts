// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class hcc
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new hcd();
    public final int a;
    public final String b[];
    public final int c[];

    public hcc(int i, String as[], int ai[])
    {
        a = i;
        b = as;
        c = ai;
    }

    hcc(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.createStringArray();
        c = parcel.createIntArray();
    }

    hch a()
    {
        return new hch(b, c);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeStringArray(b);
        parcel.writeIntArray(c);
    }

}

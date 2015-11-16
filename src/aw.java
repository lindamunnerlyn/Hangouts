// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

final class aw
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ax();
    az a[];
    int b[];
    y c[];

    public aw()
    {
    }

    public aw(Parcel parcel)
    {
        a = (az[])parcel.createTypedArray(az.CREATOR);
        b = parcel.createIntArray();
        c = (y[])parcel.createTypedArray(y.CREATOR);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeTypedArray(a, i);
        parcel.writeIntArray(b);
        parcel.writeTypedArray(c, i);
    }

}

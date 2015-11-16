// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class drl
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new drm();
    public String a;
    public String b;
    public int c;
    public int d;

    public drl()
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

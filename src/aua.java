// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class aua extends ato
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new aub();
    public String e;
    public String f;

    public aua()
    {
    }

    aua(Parcel parcel)
    {
        super.b(parcel);
        e = parcel.readString();
        f = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.a(parcel);
        parcel.writeString(e);
        parcel.writeString(f);
    }

}

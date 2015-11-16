// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class atj extends asy
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new atk();
    public String e;
    public String f;

    public atj()
    {
    }

    atj(Parcel parcel)
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

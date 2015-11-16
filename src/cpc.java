// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class cpc
    implements gwl
{

    public static final android.os.Parcelable.Creator CREATOR = new cpd();

    public cpc()
    {
    }

    public boolean a(int i, gmu gmu)
    {
        return dbf.e(i).r();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
    }

}

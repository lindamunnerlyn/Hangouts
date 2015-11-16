// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class cpi
    implements gwl
{

    public static final android.os.Parcelable.Creator CREATOR = new cpj();

    public cpi()
    {
    }

    public boolean a(int i, gmu gmu1)
    {
        return gmu1.d("logged_in") || gmu1.d("sms_only");
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
    }

}

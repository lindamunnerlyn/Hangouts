// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class cqy
    implements hav
{

    public static final android.os.Parcelable.Creator CREATOR = new cqz();

    public cqy()
    {
    }

    public boolean a(int i, grb grb1)
    {
        return grb1.d("logged_in") || grb1.d("sms_only");
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
    }

}

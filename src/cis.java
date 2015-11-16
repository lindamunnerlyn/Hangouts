// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class cis
    implements gwl
{

    public static final android.os.Parcelable.Creator CREATOR = new cit();

    public cis()
    {
    }

    public boolean a(int i, gmu gmu1)
    {
        boolean flag1 = false;
        boolean flag2 = dbf.j();
        boolean flag;
        if (flag2 && gmu1.d("sms_only"))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (flag2 && gmu1.d("is_sms_account"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (gmu1.d("is_gv_sms_integration_enabled") || i != 0 || flag)
        {
            flag1 = true;
        }
        return flag1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
    }

}

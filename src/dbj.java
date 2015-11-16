// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class dbj
    implements android.os.Parcelable.Creator
{

    dbj()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        String s = parcel.readString();
        String s1 = parcel.readString();
        String s2 = parcel.readString();
        String s3 = parcel.readString();
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new dbi(s, s1, s2, s3, flag);
    }

    public Object[] newArray(int i)
    {
        return new dbi[i];
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class cez
    implements android.os.Parcelable.Creator
{

    cez()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        String s1 = null;
        String s;
        if (parcel.readInt() == 1)
        {
            s = parcel.readString();
        } else
        {
            s = null;
        }
        if (parcel.readInt() == 1)
        {
            s1 = parcel.readString();
        }
        return new cey(s, s1);
    }

    public Object[] newArray(int i)
    {
        return new cey[i];
    }
}

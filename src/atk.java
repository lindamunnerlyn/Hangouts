// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class atk
    implements android.os.Parcelable.Creator
{

    atk()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        return new atj(parcel);
    }

    public Object[] newArray(int i)
    {
        return new atj[i];
    }
}

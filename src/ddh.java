// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class ddh
    implements android.os.Parcelable.Creator
{

    ddh()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        return new ddg(parcel);
    }

    public Object[] newArray(int i)
    {
        return new ddg[i];
    }
}

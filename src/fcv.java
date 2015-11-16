// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.iid.MessengerCompat;

public final class fcv
    implements android.os.Parcelable.Creator
{

    public fcv()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        parcel = parcel.readStrongBinder();
        if (parcel != null)
        {
            return new MessengerCompat(parcel);
        } else
        {
            return null;
        }
    }

    public Object[] newArray(int i)
    {
        return new MessengerCompat[i];
    }
}

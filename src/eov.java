// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public final class eov
    implements android.os.Parcelable.Creator
{

    public eov()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        PendingIntent pendingintent = null;
        int k = g.a(parcel);
        int j = 0;
        int i = 0;
        String s = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    g.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = g.e(parcel, l);
                    break;

                case 1000: 
                    i = g.e(parcel, l);
                    break;

                case 2: // '\002'
                    s = g.i(parcel, l);
                    break;

                case 3: // '\003'
                    pendingintent = (PendingIntent)g.a(parcel, l, PendingIntent.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new Status(i, j, s, pendingintent);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new Status[i];
    }
}

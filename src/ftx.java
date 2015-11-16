// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.signin.internal.AuthAccountResult;

public final class ftx
    implements android.os.Parcelable.Creator
{

    public ftx()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        int j = g.a(parcel);
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    g.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = g.e(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AuthAccountResult(i);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new AuthAccountResult[i];
    }
}

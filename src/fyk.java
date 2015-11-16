// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;

public final class fyk
    implements android.os.Parcelable.Creator
{

    public fyk()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        byte byte1 = 0;
        int j = g.a(parcel);
        String s = null;
        byte byte0 = 0;
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

                case 2: // '\002'
                    byte0 = g.d(parcel, k);
                    break;

                case 3: // '\003'
                    byte1 = g.d(parcel, k);
                    break;

                case 4: // '\004'
                    s = g.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AmsEntityUpdateParcelable(i, byte0, byte1, s);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new AmsEntityUpdateParcelable[i];
    }
}

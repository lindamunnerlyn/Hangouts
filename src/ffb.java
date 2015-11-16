// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.herrevad.PredictedNetworkQuality;

public final class ffb
    implements android.os.Parcelable.Creator
{

    public ffb()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        long l1 = 0L;
        int i = 0;
        int l = g.a(parcel);
        long l2 = 0L;
        int j = 0;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    g.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = g.e(parcel, i1);
                    break;

                case 2: // '\002'
                    j = g.e(parcel, i1);
                    break;

                case 3: // '\003'
                    i = g.e(parcel, i1);
                    break;

                case 4: // '\004'
                    l2 = g.f(parcel, i1);
                    break;

                case 5: // '\005'
                    l1 = g.f(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new PredictedNetworkQuality(k, j, i, l2, l1);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new PredictedNetworkQuality[i];
    }
}

package name.lizhe.dao.impl;
 
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
 
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.model.ModelService;
 
import java.util.List;
 
import javax.annotation.Resource;
 
import org.junit.Test;

import name.lizhe.dao.LizhebuglistDao;
 

public class LizhebuglistDaoImplTest extends ServicelayerTransactionalTest
{
    @Resource
    private LizhebuglistDao lizhebuglistDao;
 
    @Resource
    private ModelService modelService;
 
    @Test
    public void lizhebuglistDaoTest()
    {
   	 assertEquals(0, lizhebuglistDao.getBugList().size());
    }
 
}